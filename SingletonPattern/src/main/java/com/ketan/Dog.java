package com.ketan;

public class Dog {
    private final Logger logger = Logger.getInstance();
    private final LoggerEnum logger1 = LoggerEnum.getInstance();


    public void woof() {
        logger.log("Woof");
        logger1.log("Woof");
    }
}
