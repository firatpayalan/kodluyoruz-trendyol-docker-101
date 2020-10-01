FROM gradle:6.6.1-jdk11 AS build
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle build -x test

FROM openjdk:11-jre-slim
RUN apt-get update
RUN apt-get -y install curl
RUN mkdir /app
COPY --from=build /home/gradle/src/build/libs/*.jar /app/dockerize-app-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app/dockerize-app-0.0.1-SNAPSHOT.jar"]

