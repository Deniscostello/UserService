FROM openjdk:17-jdk-alpine
ENV PROFILE=docker
WORKDIR /app
COPY target/CiCD_Project_User-0.0.1-SNAPSHOT.jar /app
EXPOSE 8081
CMD ["java", "-jar", "CiCD_Project_User-0.0.1-SNAPSHOT.jar", "--spring.profiles.active=docker"]