FROM eclipse-temurin:25-jdk
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app_users_management.jar
EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app_users_management.jar"]
