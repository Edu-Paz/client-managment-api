# Client Management API

This project is a RESTful API developed with **Java** and **Spring Boot** for managing client records. It was built following professional software architecture patterns, including a clear separation of layers (Controller, Service, Repository) and DTO (Data Transfer Object) patterns.

## Technologies
- **Java 17**
- **Spring Boot 3**
- **Spring Data JPA**
- **H2 Database** (for development and testing)
- **Bean Validation** (Jakarta Validation)
- **Maven**

## Features
- **Full CRUD**: Create, Read (all and by ID), Update, and Delete clients.
- **Pagination**: Optimized retrieval of client lists using Spring Data's `Pageable`.
- **Validation**: Data integrity checks for fields such as `name`, `income`, and `birthDate`.
- **Global Exception Handling**: Custom responses for resources not found (404), validation errors (422), and malformed requests (400).

## API Endpoints

### Clients
| Method | Endpoint | Description | Status Code |
| :--- | :--- | :--- | :--- |
| **GET** | `/clients` | Retrieve all clients (paged) | 200 OK |
| **GET** | `/clients/{id}` | Retrieve a client by ID | 200 OK / 404 Not Found |
| **POST** | `/clients` | Create a new client | 201 Created / 422 Unprocessable Entity |
| **PUT** | `/clients/{id}` | Update an existing client | 200 OK / 404 Not Found |
| **DELETE** | `/clients/{id}` | Remove a client | 204 No Content / 404 Not Found |

### Request Body Example (POST/PUT)
{
  "name": "Isabela Ferreira",
  "cpf": "98765432109",
  "income": 5400.0,
  "birthDate": "1995-10-15",
  "children": 2
}

## Architecture
The project follows a standard layered architecture to ensure maintainability and scalability:

1. Entities: Database mapping using JPA annotations.
2. Repositories: Data access layer for database operations.
3. Services: Business logic, transaction management, and exception triggering.
4. Controllers: REST controllers to handle HTTP requests and responses.
5. DTOs: Data Transfer Objects to encapsulate data and apply validation rules.
6. Exceptions: Centralized Global Exception Handler to capture custom exceptions and return standardized JSON error objects.

## How to Run
1. Clone the repository:
   git clone https://github.com/Edu-Paz/client-management-api.git

2. Navigate to the project folder:
   cd client-management-api

3. Run the application:
   ./mvnw spring-boot:run

4. Access the H2 Console (Development environment):
   http://localhost:8080/h2-console
   - JDBC URL: jdbc:h2:mem:testdb
   - User: sa
   - Password: (empty)

## License
This project is for educational purposes as part of the DevSuperior Bootcamp.
