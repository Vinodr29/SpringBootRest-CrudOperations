# SpringBootRest-CrudOperations

#Spring Boot REST API - CRUD Operations This project is a Spring Boot REST API that demonstrates CRUD (Create, Read, Update, Delete) operations using MySQL as the database. The API is tested and executed using Postman.

🛠️ Features : ✅ Create a new record in the database ✅ Retrieve all records or a specific record ✅ Update an existing record ✅ Delete a record from the database

🏗️ Technologies Used : Spring Boot (Backend API) Spring Data JPA (ORM for database operations) MySQL (Database) Postman (API testing & execution) Maven (Dependency management)

📌 API Endpoints & Usage (via Postman) :

Create a new record : Endpoint: POST -http://localhost:8080/subjects/ Request Body (JSON):
{ "id": 1, "name": "SpringBoot" }

Get all records : Endpoint: GET -http://localhost:8080/subjects/

Update a record " Endpoint: PUT-http://localhost:8080/subjects/{id} Request Body (JSON): { "id": 1, "name": "SpringBoot Updated" }

Delete a record : Endpoint: Delete-http://localhost:8080/subjects/{id}

TO RUN THE CODE :

Make changes in the application.properties with your database username,password,database name .
