FROM amazoncorretto:17-alpine-jdk
MAINTAINER Agus
COPY target/proyectoFinal-0.0.1-SNAPSHOT.jar  proyectoFinal-app.jar
ENTRYPOINT ["java","-jar","/proyectoFinal-app.jar"]
