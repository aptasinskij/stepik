package javabasecource.logging.postservice;

import javabasecource.logging.postservice.exceptions.IllegalPackageException;
import javabasecource.logging.postservice.exceptions.StolenPackageException;

/**
 *
 * Inspector – Инспектор, который следит за запрещенными и украденными посылками и бьет тревогу в виде исключения, если
 * была обнаружена подобная посылка. Если он заметил запрещенную посылку с одним из запрещенных содержимым
 * ("weapons" и "banned substance"), то он бросает IllegalPackageException. Если он находит посылку, состоящую из камней
 * (содержит слово "stones"), то тревога прозвучит в виде StolenPackageException. Оба исключения вы должны объявить
 * самостоятельно в виде непроверяемых исключений.
 *
 **/
public class Inspector implements MailService {

    public static final String WEAPONS = "weapons";
    public static final String BANNED_SUBSTANCE = "banned substance";
    public static final String STONES = "stones";

    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailPackage){
            MailPackage mailToInspect = (MailPackage) mail;
            Package content = mailToInspect.getContent();
            if (content.getContent().contains(WEAPONS) || content.getContent().contains(BANNED_SUBSTANCE)){
                throw new IllegalPackageException("Found illegal package!");
            }
            if (content.getContent().contains(STONES)){
                throw new StolenPackageException("Stolen package detected!");
            }
        }
        return mail;
    }

}
