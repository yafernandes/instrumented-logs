package com.dd;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import datadog.trace.api.Trace;

public class InstrSlf4j {

	private static final Logger logger = LoggerFactory.getLogger(InstrSlf4j.class);

	@Trace
	public void doSomething() {
		// MDC.put(CorrelationIdentifier.getTraceIdKey(), CorrelationIdentifier.getTraceId());
		// MDC.put(CorrelationIdentifier.getSpanIdKey(), CorrelationIdentifier.getSpanId());
		logger.info("Logging with slf4j");
	}

}
