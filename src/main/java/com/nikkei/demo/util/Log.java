package com.nikkei.demo.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Log {
    protected final static Logger logger = LoggerFactory.getLogger(Log.class);
    public static void info(String msg) {
        logger.info(msg);
    }
    public static void warn(String msg) {
        logger.warn(msg);
    }
    public static void error(String msg) {
        logger.error(msg);
    }
    public static void debug(String msg) {
        logger.debug(msg);
    }
    public static void trace(String msg) {
        logger.trace(msg);
    }
}
