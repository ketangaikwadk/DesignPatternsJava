package com.ketan;

public final class Logger {

    private static Logger INSTANCE;

    private Logger() {
    }

    public static final Logger getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Logger();
        }
        return INSTANCE;
    }

    void log(String logMessage) {
        System.out.println(logMessage);
    }
}
