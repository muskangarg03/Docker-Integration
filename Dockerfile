FROM openjdk:23-jdk
ADD target/docker-demo.jar docker-demo.jar
ENTRYPOINT ["java","-jar", "/docker-demo.jar"]