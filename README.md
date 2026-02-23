

# 📝 Users Management API

A robust and scalable RESTful API built with **Spring Boot 4.0.2** and **Java 25** to manage user data efficiently. This project follows a clean architecture, implementing the Service layer pattern and proper exception handling. 🏗️

### 🌟 Features

* **CRUD Operations**: Full support for Creating, Reading, Updating, and Deleting user records.
* **Data Persistence**: Integrated with **PostgreSQL** using Spring Data JPA for reliable storage.
* **Global Exception Handling**: Custom error responses (e.g., `UserNotFoundException`) for a better API consumer experience.
* **Modern Java**: Leverages the latest features of Java 25.
* **Boilerplate Reduction**: Uses **Lombok** to keep the code clean and maintainable.

---

### 🛠️ Tech Stack

| Technology | Description |
| --- | --- |
| **Java 25** | Programming Language |
| **Spring Boot 4.0.2** | Application Framework |
| **Spring Data JPA** | ORM / Database Communication |
| **PostgreSQL** | Relational Database |
| **Lombok** | Library to reduce boilerplate code |
| **Maven** | Dependency Management |

---

### 🚀 Getting Started

#### 1️⃣ Installation & Setup

Clone the repository to your local machine:

```bash
git clone https://github.com/Ciro836/Users-Management-API.git
cd Users-Management-API

```

#### 2️⃣ Database Configuration

Update the `src/main/resources/application.properties` file with your local PostgreSQL credentials:

* **URL**: `jdbc:postgresql://localhost:5432/usersProyect`
* **User/Password**: Your local PostgreSQL setup.

#### 3️⃣ IDE Configuration (Lombok) 🛠️

This project uses **Lombok** to reduce boilerplate code (like getters and setters). To avoid compilation errors in your IDE:

* **IntelliJ IDEA**: Go to `Settings` > `Build, Execution, Deployment` > `Compiler` > `Annotation Processors` and check **"Enable annotation processing"**.
* **Plugins**: Ensure the **Lombok plugin** is installed and enabled.

#### 4️⃣ Running the Application

**Option A: Using IntelliJ IDEA**

1. Open the project in **IntelliJ**.
2. Wait for Maven to download dependencies.
3. Open `src/main/java/com/proyecto/usersproyect/UsersProyectApplication.java`.
4. Click the **Run** button ▶️.

**Option B: Using Terminal**

```bash
./mvnw spring-boot:run

```

*(The project includes the Maven Wrapper, so you don't need to install Maven manually)*.

---

### 🛣️ API Endpoints

All endpoints are prefixed with `/user`.

| Method | Endpoint | Description |
| --- | --- | --- |
| `POST` | `/user` | Create a new user |
| `GET` | `/user` | Retrieve all users |
| `GET` | `/user/{id}` | Get a specific user by ID |
| `PUT` | `/user/{id}` | Update an existing user |
| `DELETE` | `/user/{id}` | Delete a user by ID |

---

### 📦 Project Structure

* **Controller**: Handles HTTP requests.
* **Service**: Contains business logic (Interface + Implementation).
* **Model**: JPA Entities (User).
* **Repository**: Data access layer using JpaRepository.
* **Exception**: Custom exception logic and global handler.
