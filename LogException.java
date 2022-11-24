package com.log4j.programs;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class LogException {
	static Logger log=Logger.getLogger(LogException.class);
	public static void main(String[] args) {
		BasicConfigurator.configure();
		int a=10;
		int b=0;
		try {
			int c=a/b;
			System.out.println(c);
			System.out.println(c);
			}
		catch(Exception e){
			log.info(e);
			
		}
	}

}
