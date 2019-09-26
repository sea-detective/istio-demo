FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY target/spring-boot-demo-api-1.0-SNAPSHOT.jar spring-boot-demo.jar
ENTRYPOINT ["java","-jar","/spring-boot-demo.jar"]