# 📚 Library Management System

## 📌 Overview
The Library Management System is a backend application developed using Java and Spring Boot to manage library operations such as book management, user management, and book issue/return transactions.

It follows a layered architecture (Controller, Service, Repository) and uses REST APIs for communication.

---

## 🚀 Features
- Add, update, delete books (CRUD operations)
- Manage users
- Issue and return books
- Track book availability
- RESTful API integration
- Exception handling and validation

---

## 🛠️ Tech Stack
- Java
- Spring Boot
- REST APIs
- JDBC
- MySQL
- Maven

---

## 🏗️ Project Architecture
The project follows a layered architecture:

Controller → Handles HTTP requests  
Service → Business logic  
Repository → Database interaction  

---

## 📂 Project Structure

Library-Management-System/
│── src/main/java/com/example/library
│ ├── controller
│ ├── service
│ ├── repository
│ ├── model
│── src/main/resources
│ ├── application.properties
│── pom.xml


---

## ⚙️ Prerequisites
Make sure you have installed:

- Java (JDK 8 or above)
- Maven
- MySQL
- IDE (IntelliJ / VS Code)

---

## 🗄️ Database Setup

1. Open MySQL
2. Create database:

```sql
CREATE DATABASE library_db;




