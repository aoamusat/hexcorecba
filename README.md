# Spring Boot Account Management System

This project is a Spring Boot application for managing bank accounts, providing a RESTful API for account creation and management.

The Account Management System is designed to handle basic banking operations, focusing on account creation and data management. It utilizes Spring Boot's powerful features to create a robust and scalable backend service. The system is built with a layered architecture, separating concerns between controllers, services, and data access layers.

Key features of this application include:
- RESTful API for account management
- Data persistence using JPA and MySQL
- DTO pattern for data transfer
- Mapping between entities and DTOs
- Validation of input data
- Lombok for reducing boilerplate code

## Repository Structure

```
.
├── pom.xml
└── src
    ├── main
    │   └── java
    │       └── com
    │           └── hexcore
    │               └── cba
    │                   └── hexcorecba
    │                       ├── controller
    │                       │   └── AccountController.java
    │                       ├── dto
    │                       │   └── AccountDTO.java
    │                       ├── entity
    │                       │   └── Account.java
    │                       ├── HexcorecbaApplication.java
    │                       ├── mapper
    │                       │   └── AccountMapper.java
    │                       ├── repository
    │                       │   └── AccountRepository.java
    │                       └── service
    │                           ├── AccountService.java
    │                           └── impl
    │                               └── AccountServiceImpl.java
    └── test
        └── java
            └── com
                └── hexcore
                    └── cba
                        └── hexcorecba
                            └── HexcorecbaApplicationTests.java
```

Key Files:
- `pom.xml`: Maven project configuration file
- `src/main/java/com/hexcore/cba/hexcorecba/HexcorecbaApplication.java`: Main application entry point
- `src/main/java/com/hexcore/cba/hexcorecba/controller/AccountController.java`: REST controller for account operations
- `src/main/java/com/hexcore/cba/hexcorecba/service/impl/AccountServiceImpl.java`: Service implementation for account operations
- `src/main/java/com/hexcore/cba/hexcorecba/entity/Account.java`: JPA entity representing an account
- `src/main/java/com/hexcore/cba/hexcorecba/dto/AccountDTO.java`: Data Transfer Object for account information

## Usage Instructions

### Installation

Prerequisites:
- Java Development Kit (JDK) 21
- Maven 3.6 or higher
- MySQL 8.0 or higher

Steps:
1. Clone the repository to your local machine.
2. Navigate to the project root directory.
3. Run `mvn clean install` to build the project and download dependencies.

### Getting Started

1. Configure your MySQL database connection in `application.properties` (not provided in the current structure).
2. Run the application using:
   ```
   mvn spring-boot:run
   ```
3. The application will start on `http://localhost:8080` by default.

### Configuration Options

The application uses Spring Boot's default configuration. You can customize the following in `application.properties`:

- `spring.datasource.url`: JDBC URL for your MySQL database
- `spring.datasource.username`: Database username
- `spring.datasource.password`: Database password
- `server.port`: Application port (default is 8080)

### API Endpoints

#### Create Account

```
POST /api/accounts
```

Request body:
```json
{
  "accountNumber": "1234567890",
  "accountName": "John Doe",
  "accountType": "SAVINGS",
  "balance": 1000.00,
  "email": "john.doe@example.com",
  "phoneNumber": "+1234567890",
  "isActive": true
}
```

Response:
```json
{
  "id": 1,
  "accountNumber": "1234567890",
  "accountName": "John Doe",
  "accountType": "SAVINGS",
  "balance": 1000.00,
  "email": "john.doe@example.com",
  "phoneNumber": "+1234567890",
  "isActive": true
}
```

### Testing & Quality

To run tests:
```
mvn test
```

### Troubleshooting

Common issues:

1. Database connection failure
   - Error message: "Could not create connection to database server"
   - Check your database credentials in `application.properties`
   - Ensure MySQL server is running and accessible

2. Port already in use
   - Error message: "Web server failed to start. Port 8080 was already in use"
   - Change the port in `application.properties`:
     ```
     server.port=8081
     ```

Debugging:
- Enable debug logging by adding `logging.level.root=DEBUG` to `application.properties`
- Check application logs in the console or in `logs/application.log` (if configured)

Performance optimization:
- Monitor database query performance using MySQL slow query log
- Use Spring Boot Actuator for application metrics and health checks

## Data Flow

The data flow in this application follows these steps:

1. Client sends a POST request to `/api/accounts` with account details
2. `AccountController` receives the request and validates the `AccountDTO`
3. `AccountController` calls `AccountService.createAccount()`
4. `AccountServiceImpl` maps the `AccountDTO` to an `Account` entity
5. `AccountServiceImpl` saves the `Account` entity using `AccountRepository`
6. The saved `Account` is mapped back to an `AccountDTO`
7. `AccountController` returns the created `AccountDTO` with HTTP status 201 (CREATED)

```
[Client] -> [AccountController] -> [AccountService] -> [AccountRepository]
                                                              |
                                                              v
[Client] <- [AccountController] <- [AccountService] <- [Database]
```

Note: Ensure proper error handling and validation at each step of the data flow.