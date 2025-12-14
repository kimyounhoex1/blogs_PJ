FROM eclipse-temurin:17-jdk
LABEL maintainer="kim"

ARG JAR_FILE=build/libs/blog-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
