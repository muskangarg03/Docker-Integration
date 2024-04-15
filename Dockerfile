FROM openjdk:23-jdk
EXPOSE 8080 
ADD target/docker-demo.jar docker-demo.jar
ENTRYPOINT ["java","-jar", "/docker-demo.jar"]
