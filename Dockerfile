FROM maven:latest AS build
COPY src /home/app/src
COPY pom.xml /home/app

RUN mvn -f /home/app/pom.xml clean package
FROM eclipse-temurin:latest
COPY --from=build /home/app/target/web_app_spring_training-1.0.0.jar /usr/local/lib/app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/usr/local/lib/app.jar"]
