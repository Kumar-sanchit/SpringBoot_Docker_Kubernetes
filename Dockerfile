FROM openjdk:17-jdk-slim-buster
COPY target/testapp-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]