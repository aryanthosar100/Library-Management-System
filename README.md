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

<img width="1903" height="905" alt="Screenshot 2026-04-19 164450" src="https://github.com/user-attachments/assets/2919a3e3-eecc-4287-8c06-100873e36e72" />
<img width="1904" height="912" alt="Screenshot 2026-04-19 164501" src="https://github.com/user-attachments/assets/33bc8b97-892c-4beb-9737-59ce3b628fd4" />





## 🗄️ Database Setup

1. Open MySQL
2. Create database:

```sql
CREATE DATABASE library_db;




