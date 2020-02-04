FROM openjdk:8-alpine
COPY application.jar /application.jar
COPY dd-java-agent.jar /dd-java-agent.jar
ENV DD_LOGS_INJECTION true
ENV DD_SERVICE_NAME instrumented-logs
CMD [ "java", "-javaagent:dd-java-agent.jar", "-jar", "application.jar"]
EXPOSE 8080
