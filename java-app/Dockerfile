FROM maven:3.9.6-eclipse-temurin-21-alpine AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

FROM eclipse-temurin:21-jdk-alpine
WORKDIR /app
COPY --from=build /app/target/logapp-1.0-SNAPSHOT.jar logapp.jar
CMD ["java", "-jar", "logapp.jar"]
