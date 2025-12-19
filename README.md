# Banking Application (Spring Boot)

## Overview

This **Banking Application** is a backend system built using **Spring Boot** that simulates core banking operations such as account creation, balance management, fund transfers, and transaction tracking. The project focuses on **clean REST APIs, database integrity, and transactional consistency**, reflecting real-world backend development practices.

---

## Features

* Account creation and management
* Deposit and withdrawal operations
* Secure fund transfer between accounts
* Transaction history tracking (credit & debit)
* Centralized exception handling
* Environment-based configuration

---

## Technology Stack

* **Language:** Java
* **Framework:** Spring Boot
* **ORM:** Spring Data JPA (Hibernate)
* **Database:** MySQL
* **Build Tool:** Maven
* **API Style:** RESTful APIs

---

## Project Structure

```
banking-app
├── controller
├── service
├── repository
├── entity
├── dto
├── exception
```

---

## Database Design 

### Account

* id
* accountHolderName
* balance
### Transaction

* id
* amount

---

## API Endpoints (Sample)

| Method | Endpoint                        | Description         |
| ------ | ------------------------------- | ------------------- |
| POST   | `/api/accounts`                 | Create new account  |
| GET    | `/api/accounts/{id}`            | Get account details |
| POST   | `/api/accounts/deposit`         | Deposit amount      |
| POST   | `/api/accounts/withdraw`        | Withdraw amount     |
---
## Configuration

Update `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/banking_app
spring.datasource.username=bank_user
spring.datasource.password=${DB_PASSWORD}

spring.jpa.hibernate.ddl-auto=validate
spring.jpa.show-sql=true
```

Set environment variable:

```bash
export DB_PASSWORD=your_password
```

---

## How to Run

1. Clone the repository

   ```bash
   git clone https://github.com/your-username/banking-app.git
   ```
2. Create MySQL database

   ```sql
   CREATE DATABASE banking_app;
   ```
3. Configure database credentials
4. Run the application

   ```bash
   mvn spring-boot:run
   ```

---

## Key Learnings

* Handling database transactions safely
* Preventing partial updates during failures
* Debugging Hibernate and JDBC configuration issues
* Structuring a real-world Spring Boot backend
---
