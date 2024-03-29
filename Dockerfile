# For Java 8, try this
# FROM openjdk:8-jdk-alpine

# For Java 11, try this
FROM adoptopenjdk/openjdk11:alpine-jre

# Refer to Maven build -> finalName
ARG JAR_FILE=target/simple-order-service.jar

# cd /opt/app
WORKDIR /opt/app

# cp target/order-0.0.1-SNAPSHOT.jar /opt/app/app.jar
COPY ${JAR_FILE} simple-order-service.jar

# java -jar /opt/app/app.jar
ENTRYPOINT ["java","-jar","simple-order-service.jar"]

## sudo docker run -p 8080:8080 -t docker-spring-boot:1.0
## sudo docker run -p 80:8080 -t docker-spring-boot:1.0
## sudo docker run -p 443:8443 -t docker-spring-boot:1.0