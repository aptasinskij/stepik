package javabasecource.logging.postservice;

import java.util.logging.Logger;

/**
 * Created by andrew on 17.01.17.
 */
public class RealMailService implements MailService{
    private static final Logger LOGGER = Logger.getLogger(RealMailService.class.getName());
    public RealMailService(){
        LOGGER.info("New real mail service is started.");
    }
    @Override
    public Sendable processMail(Sendable mail) {
        LOGGER.info("Processing mail. From: " + mail.getFrom().toUpperCase() + " : to " + mail.getTo().toUpperCase());
        LOGGER.info("Done.");
        return mail;
    }
}
