FROM openjdk:11.0-jre-slim

COPY ./target/DataStreamer-0.0.1-SNAPSHOT.jar /usr/app/

WORKDIR /usr/app

RUN sh -c 'touch DataStreamer-0.0.1-SNAPSHOT.jar'

ENTRYPOINT ["java","-jar","DataStreamer-0.0.1-SNAPSHOT.jar"]