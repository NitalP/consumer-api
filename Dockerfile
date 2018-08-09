
FROM repository.cars.com/openjdk-jdk8-alpine33:0.0.1 as build

WORKDIR /app
VOLUME /tmp
ADD . /app
RUN chmod +x start.sh &&     /app/gradlew build


FROM repository.cars.com/openjdk-jdk8-alpine33:0.0.1

WORKDIR /app
ADD ./start.sh .
RUN chmod +x start.sh
COPY --from=build /app/build/libs/consumer-api-1.0.jar /app/build/libs/

EXPOSE 9000
ENTRYPOINT ["./start.sh"]