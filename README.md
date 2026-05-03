# Users Management API

RESTful user-management API built with Java, Spring Boot, Spring Data JPA and PostgreSQL. The project demonstrates a clean backend CRUD flow with controller, service, repository, entity modeling, custom exceptions and Docker-based deployment.

## Backend highlights

- CRUD endpoints for user records.
- Layered architecture with controller, service, repository and model packages.
- PostgreSQL persistence through Spring Data JPA.
- Unique username and email constraints at the entity level.
- Custom `UserNotFoundException`.
- Global exception handling with `@RestControllerAdvice`.
- Dockerfile and Docker Compose configuration for local containerized deployment.
- Environment-variable based database configuration.

## Tech stack

- Java 25
- Spring Boot 4
- Spring MVC
- Spring Data JPA
- PostgreSQL
- Docker
- Docker Compose
- Maven
- Lombok

## API endpoints

Base URL:

```text
http://localhost:8080
```

All endpoints are prefixed with `/user`.

| Method | Endpoint | Description |
| --- | --- | --- |
| `POST` | `/user` | Create a user |
| `GET` | `/user` | List all users |
| `GET` | `/user/{id}` | Find a user by ID |
| `PUT` | `/user/{id}` | Update a user by ID |
| `DELETE` | `/user/{id}` | Delete a user by ID |

Example request:

```json
{
  "username": "ciro",
  "password": "secure-password",
  "email": "ciro@example.com"
}
```

## Project structure

```text
src/main/java/com/proyecto/usersproyect
|-- controller   # REST endpoints
|-- exception    # Custom exception and global handler
|-- model        # JPA entity
|-- repository   # Spring Data repository
`-- service      # Business logic and service implementation
```

## Local setup with Maven

### 1. Clone the repository

```bash
git clone https://github.com/ciroschot-dev/Users-Management-API.git
cd Users-Management-API
```

### 2. Configure environment variables

```env
SPRING_DATASOURCE_URL=jdbc:postgresql://localhost:5432/db_users
SPRING_DATASOURCE_USERNAME=postgres
SPRING_DATASOURCE_PASSWORD=your_password
```

### 3. Run the API

```bash
./mvnw spring-boot:run
```

## Local setup with Docker

Create a `.env` file:

```env
DB_USER=postgres
DB_PASSWORD=your_password
DB_NAME=db_users
SPRING_DATASOURCE_URL=jdbc:postgresql://db:5432/db_users
```

Build and start the app with PostgreSQL:

```bash
docker compose up --build
```

The API will be available at:

```text
http://localhost:8080
```

## What this project demonstrates

- Building CRUD REST APIs with Spring Boot.
- Modeling persistence with JPA entities and repositories.
- Separating HTTP, business and persistence concerns.
- Handling not-found errors with custom exceptions.
- Running a backend service with Docker and PostgreSQL.
