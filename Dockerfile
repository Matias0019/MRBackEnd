FROM amazoncorretto:8-alpine-jdk
MAINTAINER matiasromero
COPY target/back-0.0.1-SNAPSHOT.jar back-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/back-0.0.1-SNAPSHOT.jar"]