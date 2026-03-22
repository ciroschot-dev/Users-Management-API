FROM openjdk:25.02
ARG JAR_FILE=target/users_management-1.0.jar
COPY ${JAR_FILE} app_users_management.jar
EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app_users_management.jar"]
