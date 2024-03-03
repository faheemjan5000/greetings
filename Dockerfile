FROM openjdk:17
EXPOSE 8080
ADD target/greetings.jar greetings.jar
ENTRYPOINT ["java","-jar","/greetings.jar"]