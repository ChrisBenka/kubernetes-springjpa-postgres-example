FROM openjdk:alpine
MAINTAINER Chris Benka <chrisbenka@gmail.com>
ADD target/demo-postgres.jar demo-postgres.jar
ENTRYPOINT ["java", "-jar", "demo-postgres.jar"]
EXPOSE 8080