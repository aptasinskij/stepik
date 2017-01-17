package javabasecource.logging.postservice;

import java.util.logging.Logger;

/**
 * Created by andrew on 17.01.17.
 */
public class Spy implements MailService {

    private Logger logger;

    public Spy(Logger logger) {
        this.logger = logger;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailMessage){
            if (mail.getTo().equals("Austin Powers") || mail.getFrom().equals("Austin Powers")){
                String from = mail.getFrom();
                String to = mail.getTo();
                String message = ((MailMessage) mail).getMessage();
                logger.warning(String.format("Detected target mail correspondence: from %s to %s \"%s\"", from, to, message));
            } else {
                logger.info(String.format("Usual correspondence: from %s to %s", mail.getFrom(), mail.getTo()));
            }
        }
        return mail;
    }
}
