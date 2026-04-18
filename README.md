# Task Manager REST API
A RESTful API built with Java and Spring Boot for managing daily tasks.
Supports full CRUD operations with a PostgreSQL database.

## Tech Stack
- Java
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Maven

## Features
- Create, read, update and delete tasks
- Data persistence with PostgreSQL
- Proper HTTP status codes (200, 201, 404)
- Layered architecture (Controller, Service, Repository)

## API Endpoint
- Method    Endpoint      Description
  GET      /tasks         Get all tasks
  GET      /tasks/{id}    Get tasks by ID
  POST     /tasks         Create new tasks
  PUT      /tasks/{id}    Update a task
  DELETE   /tasks/{id}    Delete a task

## Setup
1. Clone a repository
2. Create a postgreSQL database named 'taskmanager'
3. Update 'application.properties' with your database password
4. Run the application using IntelliJ or 'mvn spring-boot:run'
5. API will be available at 'http://localhost:8080
