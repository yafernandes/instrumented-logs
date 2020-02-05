# Instrumented Logs

This simple Jetty server demostrates Datadog capabilities of auto instrumenting log4j, log4j2, and slf4j.

You can test by running the command below on your local machine.

`docker run --rm -p 8080:8080 yaalexf/instrumented-logs`

Click the links below to generate log entries.

[Log4j](http://localhost:8080/instrumented-logs/log4j)  
[Log4j2](http://localhost:8080/instrumented-logs/log4j2)  
[SLF4J](http://localhost:8080/instrumented-logs/slf4j)  

Deploying this application on Kubernetes will give you traces and logs.  Datadog will use the trace id for correlation.  The provided [manifest](kubernetes/instrumented-logs.yaml) will deploy the application and set up NGINX ingress if present.

Log4j instrumentation is not automatically detected by standard pipelines.  Edit the `Reserved attributes mapping` and add `mdc.dd.trace_id` to `Trace Id attributes`.