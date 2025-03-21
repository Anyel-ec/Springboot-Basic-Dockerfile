# Spring Boot Application - Docker Configuration

This project contains a Docker configuration for running a Spring Boot application using JDK 17.

## Dockerfile Overview

The `Dockerfile` defines the steps to containerize the Spring Boot application and run it efficiently.

### Dockerfile
```dockerfile
# Base image with JDK 17
FROM openjdk:17-jdk-alpine

# Set working directory inside the container
WORKDIR /app

# Copy the JAR file to the container
COPY app.jar .

# Expose the application's port
EXPOSE 8080

# Command to run the application
CMD ["java", "-jar", "app.jar"]
```

## Building and Running the Docker Image

### Build the Docker Image
Run the following command in the project root directory (where the `Dockerfile` is located):
```sh
docker build -t my-spring-app .
```

### Run the Docker Container
After building the image, you can start the container using:
```sh
docker run -p 8080:8080 my-spring-app
```

### Verify the Application
Once the container is running, access the application by visiting:
```
http://localhost:8080
```

## Notes
- Ensure that `app.jar` is built and available before building the Docker image.
- Modify the `EXPOSE` directive if your application uses a different port.
- Use environment variables if needed for database connections or application properties.

This configuration provides a lightweight and efficient way to deploy your Spring Boot application using Docker.
