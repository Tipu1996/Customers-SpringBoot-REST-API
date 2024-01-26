## Project Description: Customer Management System
This project is a simple Customer Management System built using Spring Boot and PostgreSQL. It provides basic CRUD (Create, Read, Update, Delete) operations for managing customer records through a RESTful API. The system allows users to interact with customer data by adding, retrieving, updating, and deleting customer records.

## Key Features:
RESTful API Endpoints:

GET /api/v1/customers: Retrieve a list of all customers.
POST /api/v1/customers: Add a new customer.
PUT /api/v1/customers/{id}: Update an existing customer by ID.
DELETE /api/v1/customers/{id}: Delete a customer by ID.

## Customer Entity:

The Customer entity consists of fields such as ID, name, email, and age.
The data is persisted in a PostgreSQL database.
Spring Data JPA:

The project uses Spring Data JPA for easy interaction with the database, simplifying data access and manipulation.

## Dockerized Database:

The PostgreSQL database is containerized using Docker for easy setup and portability.
Docker Compose is employed to define and manage the multi-container Docker application.
API Testing:

API endpoints are tested using tools like Postman or cURL, ensuring correct functionality.

## How to Run:

Clone the repository to your local machine.
Ensure you have Docker and Docker Compose installed.
Run docker-compose up to start the PostgreSQL database container.
Run the Spring Boot application using your preferred IDE or by executing mvn spring-boot:run.
The application will be accessible at http://localhost:5000.

## Configuration:
The PostgreSQL database is configured with username (tipu96), password (password), and database name (customer).
The Spring Boot application's application.yml file contains configuration details, including the JDBC URL.
