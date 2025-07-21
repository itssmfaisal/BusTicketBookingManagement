# Use official JDK image
FROM openjdk:21-jdk-slim

# Install Maven
RUN apt-get update && apt-get install -y maven

# Create a directory for the app
WORKDIR /app

# Copy Maven wrapper and project files
COPY mvnw ./
COPY .mvn .mvn
COPY pom.xml ./
COPY src ./src

# Build the application
RUN ./mvnw clean package -DskipTests

# Expose the app port
EXPOSE 8081

# Run the jar
CMD ["java", "-jar", "target/bus-ticket-booking-system-0.0.1-SNAPSHOT.jar"]