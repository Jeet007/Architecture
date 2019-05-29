FROM java:8-jre-alpine

ENV PROFILE=prod

CMD mkdir /app
CMD mkdir /app/example
CMD mkdir /app/example/config

COPY example-service/build/libs/example-service-1.0-SNAPSHOT.jar /app/example/service.jar

EXPOSE 8080
WORKDIR /app/example

ENTRYPOINT java -jar -Dspring.profiles.active=${PROFILE} service.jar