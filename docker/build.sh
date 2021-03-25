cd ..
gradle assemble
docker build -t yaalexf/instrumented-logs -f docker/Dockerfile .
docker push yaalexf/instrumented-logs
cd -
