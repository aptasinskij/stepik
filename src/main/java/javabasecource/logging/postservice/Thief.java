package javabasecource.logging.postservice;

/**
 * Thief – вор, который ворует самые ценные посылки и игнорирует все остальное. Вор принимает в конструкторе переменную
 * int – минимальную стоимость посылки, которую он будет воровать. Также, в данном классе должен присутствовать метод
 * getStolenValue, который возвращает суммарную стоимость всех посылок, которые он своровал. Воровство происходит следующим
 * образом: вместо посылки, которая пришла вору, он отдает новую, такую же, только с нулевой ценностью и содержимым посылки
 * "stones instead of {content}".
 **/

public class Thief implements MailService {

    private int minimalCost;
    private int stolenValue;

    public Thief(int minimalCost) {
        this.minimalCost = minimalCost;
    }

    public int getStolenValue() {
        return stolenValue;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailPackage){
            MailPackage stolenMail = (MailPackage) mail;
            int stolenPackegePrice = stolenMail.getContent().getPrice();
            if (stolenPackegePrice >= minimalCost){
                stolenValue += stolenMail.getContent().getPrice();
                String newMailPackageContent = "stones instead of " + stolenMail.getContent().getContent();
                return new MailPackage(stolenMail.getFrom(), stolenMail.getTo(), new Package(newMailPackageContent, 0));
            }
        }
        return mail;
    }
}
