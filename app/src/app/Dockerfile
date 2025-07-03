FROM openjdk:17-jdk-slim
WORKDIR /app
COPY ./app /app
RUN ./gradlew build
CMD ["java", "-jar", "build/libs/app.jar"]
