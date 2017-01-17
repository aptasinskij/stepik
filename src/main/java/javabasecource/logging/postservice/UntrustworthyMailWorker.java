package javabasecource.logging.postservice;

/**
 * Created by andrew on 17.01.17.
 */
public class UntrustworthyMailWorker implements MailService {

    private RealMailService realMailService;
    private MailService[] mailServices;

    public UntrustworthyMailWorker(MailService[] mailServices) {
        this.mailServices = mailServices;
        realMailService = new RealMailService();
    }

    public RealMailService getRealMailService() {
        return realMailService;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        for (MailService service : mailServices){
            service.processMail(mail);
        }
        return realMailService.processMail(mail);
    }

}
