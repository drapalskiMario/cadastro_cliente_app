FROM maven:3.8.4-openjdk-17-slim AS build
COPY /src /app/src
COPY /pom.xml /app
RUN mvn -f /app/pom.xml clean package -D skipTests

# Etapa 2: Criar contêiner com Java 8 e copiar artefatos
FROM openjdk:17-alpine
EXPOSE 8080
COPY --from=build /app/target/*.jar app.jar

# Comando para iniciar o aplicativo
CMD ["java", "-jar", "./app.jar"]