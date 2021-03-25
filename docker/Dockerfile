FROM openjdk:11-slim
ADD app/build/distributions/app.tar /
WORKDIR /app
ADD https://dtdg.co/latest-java-tracer /dd-java-agent.jar
ENV DD_LOGS_INJECTION true
ENV DD_SERVICE_NAME instrumented-logs
ENV JAVA_OPTS -javaagent:/dd-java-agent.jar
CMD [ "bin/app" ]
