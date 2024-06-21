FROM openjdk:17-alpine

COPY target/hostMonitor-0.0.1-SNAPSHOT.jar /app/hostMonitor.jar

EXPOSE 18080
ENTRYPOINT ["java","-jar","/app/hostMonitor.jar"]