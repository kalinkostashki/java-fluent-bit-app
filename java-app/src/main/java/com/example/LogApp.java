package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogApp {
    private static final Logger logger = LoggerFactory.getLogger(LogApp.class);

    public static void main(String[] args) {
        while (true) {
            logger.info("Starting process");
            logger.error("Exception in thread \"main\" java.lang.NullPointerException");
            logger.error("    at com.example.myproject.Book.getTitle(Book.java:16)");
            logger.error("    at com.example.myproject.Author.getBookTitles(Author.java:25)");
            logger.error("    at com.example.myproject.Bootstrap.main(Bootstrap.java:14)");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                logger.warn("Thread interrupted", e);
                break;
            }
        }
    }
}

