package com.dd;

import org.apache.log4j.Logger;

import datadog.trace.api.Trace;

public class InstrLog4j {

	final static Logger logger = Logger.getLogger(InstrLog4j.class);

	@Trace
	public void doSomething() {
		logger.info("Logging with log4j");
	}

}
