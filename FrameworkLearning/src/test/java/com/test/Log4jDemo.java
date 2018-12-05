package com.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {

	private static Logger logger = LogManager.getLogger(Log4jDemo.class);
	
	public static void main(String[] args) {
		System.out.println("Hello world");
		logger.info("This is an information message");
		logger.error("This is a error message");
		logger.warn("This is a Warn message");
		
		System.out.println("Test completed");
	}
}
