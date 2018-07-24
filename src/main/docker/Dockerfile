FROM frolvlad/alpine-oraclejdk8:slim
MAINTAINER christian.andres.vargas@gmail.com
ADD Weather-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]