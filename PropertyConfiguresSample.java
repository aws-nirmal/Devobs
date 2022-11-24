package com.log4j.programs;

//import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class PropertyConfiguresSample {
	static Logger log=Logger.getLogger(FirstProgram.class);
	public static void main(String[] args) {
		PropertyConfigurator.configure("log4j.properties");
		log.info("information");
		log.warn("warning");
		log.error("error occurs");
		log.fatal("critical error");
		log.debug("debugging the error");
	}

}
