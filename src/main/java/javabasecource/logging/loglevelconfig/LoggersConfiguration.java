package javabasecource.logging.loglevelconfig;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;

/**
 * Created by andrew on 16.01.17.
 */
public class LoggersConfiguration {

    public void loggersConfig() {
        Logger classALogger = Logger.getLogger("org.stepic.java.logging.ClassA");
        classALogger.setLevel(Level.ALL);

        Logger classBLogger = Logger.getLogger("org.stepic.java.logging.ClassB");
        classBLogger.setLevel(Level.WARNING);

        Logger parentLogger = Logger.getLogger("org.stepic.java");
        ConsoleHandler handler = new ConsoleHandler();
        handler.setLevel(Level.ALL);
        handler.setFormatter(new XMLFormatter());
        parentLogger.addHandler(handler);
        parentLogger.setUseParentHandlers(false);
    }
}
