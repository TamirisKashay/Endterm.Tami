📚 Endterm Project – Library Management REST API
👩‍💻 Author
Tamiris Kashay
1️⃣ Project Overview
This project is a Spring Boot RESTful API for a Library Management System.
The system allows:
Creating books
Retrieving all books
Retrieving book by ID
Updating books
Deleting books
The project integrates:
Spring Boot
JPA (Hibernate)
H2 Database
Design Patterns
SOLID Principles
Component Principles
Layered Architecture
2️⃣ System Architecture
Layered architecture is implemented:
Controller → Service → Repository → Database
Packages:
controller/
service/
repository/
model/
dto/
patterns/
exception/
utils/
3️⃣ REST API Documentation
Base URL
http://localhost:8080/api/books
📌 GET – Retrieve all books
GET /api/books
Response:
[
  {
    "id": 1,
    "title": "Clean Code",
    "author": "Robert Martin",
    "year": 2008,
    "pages": 450
  }
]
📌 GET – Retrieve book by ID
GET /api/books/{id}
📌 POST – Create new book
POST /api/books
Request Body:
{
  "title": "Clean Code",
  "author": "Robert Martin",
  "year": 2008,
  "pages": 450,
  "type": "printed"
}
📌 PUT – Update book
PUT /api/books/{id}
📌 DELETE – Delete book
DELETE /api/books/{id}

## Project Structure

![Project Structure](docs/screenshots/project-structure.png)
