package com.ketan;

public class Cat {
    private final Logger logger = Logger.getInstance();
    private final LoggerEnum logger1 = LoggerEnum.getInstance();


    public void meow() {
        logger.log("Meow");
        logger1.log("Meow");
    }
}
