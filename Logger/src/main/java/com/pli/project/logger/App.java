package com.pli.project.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

    private static Logger logger = LoggerFactory.getLogger(App.class);
    private static Logger logger2 = LoggerFactory.getLogger("logger2");

    public static void main(String[] args) {
        logger.info("information");
        logger.warn("warning");
        logger.error("error");
        logger2.info("abcde");
    }
}
