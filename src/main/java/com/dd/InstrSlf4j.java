package com.dd;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import datadog.trace.api.Trace;

public class InstrSlf4j {

	private static final Logger logger = LoggerFactory.getLogger(InstrSlf4j.class);

	@Trace
	public void doSomething() {
		logger.info("Logging with slf4j");
	}

}
