FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY /target/expense-tracker-0.0.1-SNAPSHOT.jar app.jar
ENV JAVA_OPS=""
ENTRYPOINT exec java -jar /app.jar