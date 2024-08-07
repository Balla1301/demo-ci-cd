FROM openjdk:17-alpine
WORKDIR /app
COPY devops-integration.jar .
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "devops-integration.jar"]