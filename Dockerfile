FROM eclipse-temurin:17-jdk-alpine
WORKDIR  /app
COPY target/laboratorio2-0.0.1-SNAPSHOT.jar  laboratorio2-0.0.1-SNAPSHOT.jar
EXPOSE 8080
CMD ["java","-jar", "laboratorio2-0.0.1-SNAPSHOT.jar"]