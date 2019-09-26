FROM openjdk:8-jdk-alpine
COPY target/spring-boot-demo-api-1.0-SNAPSHOT spring-boot-demo-api.jar
ENTRYPOINT ["java","-jar","/spring-boot-demo.jar"]