# Spring Data JPA Console App with PostgreSQL

A simple Spring Boot console application demonstrating **Spring Data JPA** with **PostgreSQL** integration.  
Built with modern Java practices, annotation‑driven configuration, and Maven workflow.

---

## 🚀 Features
- Spring Boot application with console interface
- Spring Data JPA for ORM and repository abstraction
- PostgreSQL integration with JDBC driver
- Annotation‑based configuration (no XML)
- Maven build and dependency management
- Clean project structure

---

## 🛠️ Tech Stack
- **Java 17+**
- **Spring Boot**
- **Spring Data JPA**
- **PostgreSQL**
- **Maven**

---

## ⚙️ Setup & Run

1. **Clone the repo**
```bash
   git clone https://github.com/sugganabalaji/spring-data-jpa-console-app.git
   cd spring-data-jpa-console-app
```
2. **Configure PostgreSQL**
  - Create a database Schema like: Dev
  - Update application.yaml:
```properties
  spring:
    datasource:
      url: jdbc:postgresql://localhost:5432/Dev
      username: postgres
      password: root
      driver-class-name: org.postgresql.Driver
    jpa:
      hibernate:
        ddl-auto: update   # options: none, validate, update, create, create-drop
      show-sql: true
```
3. **Build and run**
```bash
  mvn clean install
  mvn spring-boot:run
```
📂 Project Structur
```
  src/
 └── main/
     ├── java/
     │   └── com.example.consolejpa
     │       ├── entity/        # JPA Entities
     │       ├── repository/    # Spring Data Repositories
     │       ├── service/       # Business Logic
     │       └── ConsoleApp.java # Entry point
     └── resources/
         └── application.properties
```
🎯 **Use Case**

This project is ideal for:
  - Demonstrating Spring Data JPA + PostgreSQL skills
  - Practicing clean, modern Java backend practices
  - Portfolio showcase projects

