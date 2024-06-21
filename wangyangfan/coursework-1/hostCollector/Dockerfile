FROM openjdk:17-alpine

COPY target/hostCollector-0.0.1-SNAPSHOT.jar /app/hostCollector.jar

EXPOSE 18081
ENTRYPOINT ["java","-jar","/app/hostCollector.jar"]