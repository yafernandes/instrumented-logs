package com.dd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import datadog.trace.api.Trace;

public class InstrLog4j2 {

	final static Logger logger = LogManager.getLogger(InstrLog4j.class);

	@Trace
	public void doSomething() {
		logger.info("Logging with log4j2");
	}

}
