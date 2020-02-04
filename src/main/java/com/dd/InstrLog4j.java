package com.dd;

import org.apache.log4j.Logger;

import datadog.trace.api.Trace;

public class InstrLog4j {
	
	final static Logger logger = Logger.getLogger(InstrLog4j.class);

	@Trace
	public void doSomething() {
//		MDC.put(CorrelationIdentifier.getTraceIdKey(), CorrelationIdentifier.getTraceId());
//		MDC.put(CorrelationIdentifier.getSpanIdKey(), CorrelationIdentifier.getSpanId());
		logger.info("Logging with log4j");
	}

}
