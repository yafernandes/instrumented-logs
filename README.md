# Instrumented Logs

This simple Jetty server demostrates Datadog capabilities of auto instrumenting log4j, log4j2, and slf4j.

You can test by running the command below on your local machine.

`docker run --rm --name instrumented-logs yaalexf/instrumented-logs`

You can also run it on a Kubernetes cluster.

`kubectl run instrumented-logs --image=yaalexf/instrumented-logs`

Log4j instrumentation is not automatically detected by standard pipelines.  Edit the `Reserved attributes mapping` and add `mdc.dd.trace_id` to `Trace Id attributes`.
