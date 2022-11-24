package com.log4j.programs;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class FirstProgram {
	static Logger log=Logger.getLogger(FirstProgram.class);
	public static void main(String[] args) {
		BasicConfigurator.configure();
		log.info("information");
		log.warn("warning");
		log.error("error occurs");
		log.fatal("critical error");
		log.debug("debugging the error");
	}

}
