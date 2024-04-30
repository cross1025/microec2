# Use Amazon Corretto 17 as the base image
FROM amazoncorretto:17-alpine-jdk

# Set the working directory inside the container
WORKDIR /app

# Copy the compiled JAR file from the target directory into the container
COPY target/microservice-a-1.0-SNAPSHOT.jar /app/

# Specify the command to run your microservice when the container starts
CMD ["java", "-jar", "microservice-a-1.0-SNAPSHOT.jar"]
