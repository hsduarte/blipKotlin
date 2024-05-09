# Use an official Java runtime as a parent image
FROM openjdk:17-jdk-slim

# Add the application's JAR file to the container
COPY build/libs/*.jar app.jar

# Run the JAR file
ENTRYPOINT ["java", "-jar", "/app.jar"]
