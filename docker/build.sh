cp ~/java-lib/dd-java-agent-0.42.0.jar dd-java-agent.jar
cp ../build/libs/instrumented-logs-all.jar application.jar
docker build . -t yaalexf/instrumented-logs
docker push yaalexf/instrumented-logs