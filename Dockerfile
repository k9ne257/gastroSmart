# Use the official Gradle image to create a build artifact.
# This is a multi-stage build. In the first stage, we build the application.
FROM gradle:8.6.0-jdk17 AS build

# Set the working directory in the Docker image
WORKDIR /home/gradle/src

# Copy the Gradle configuration files
COPY --chown=gradle:gradle build.gradle settings.gradle /home/gradle/src/

# Copy the source code
COPY --chown=gradle:gradle src /home/gradle/src/src

# Build the application
RUN gradle build --no-daemon

# For the second stage, use an OpenJDK runtime as the base image to run the application
FROM openjdk:17-jre-slim

# Add a volume pointing to /tmp
VOLUME /tmp

# Expose the port the application runs on
EXPOSE 8080

# Copy the jar from the first stage to this image
COPY --from=build /home/gradle/src/build/libs/*.jar app.jar

# Run the application
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
