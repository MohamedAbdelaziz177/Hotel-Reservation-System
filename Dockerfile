FROM openjdk:17-jdk-slim

LABEL authors="_Abdelaziz26"

WORKDIR /app

VOLUME /tmp

COPY target/*.jar /app/Booking.jar

EXPOSE 8080

CMD ["java", "-jar", "/app/Booking.jar"]