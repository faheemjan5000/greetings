FROM openjdk:17
EXPOSE 8080
ADD target/greetingss.jar greetingss.jar
ENTRYPOINT ["java","-jar","/greetingss.jar"]