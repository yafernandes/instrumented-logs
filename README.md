# Instrumented Logs

This simple Jetty server demostrates Datadog capabilities of auto instrumenting log4j, log4j2, and slf4j.

You can test by running the command below on your local machine.

`docker run --rm -p 8080:8080 yaalexf/instrumented-logs`

Click the links below to generate log entries.

[Log4j](http://localhost:8080/instrumented-logs/log4j)  
[Log4j2](http://localhost:8080/instrumented-logs/log4j2)  
[SLF4J](http://localhost:8080/instrumented-logs/slf4j)  
