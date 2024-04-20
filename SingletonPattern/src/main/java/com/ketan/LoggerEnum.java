package com.ketan;

public enum LoggerEnum {
    INSTANCE;

    public static final LoggerEnum getInstance() {
        return INSTANCE;
    }

    void log(String logMessage) {
        System.out.println(logMessage);
    }
}
