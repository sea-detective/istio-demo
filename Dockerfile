FROM openjdk:8-jdk-alpine
COPY /spring-boot-demo-api/target/spring-boot-demo-api-1.0-SNAPSHOT.jar spring-boot-demo.jar
ENTRYPOINT ["java","-jar","/spring-boot-demo.jar"]