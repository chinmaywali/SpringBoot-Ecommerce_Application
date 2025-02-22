# 🛒 Spring Boot E-Commerce Application Backend 🚀  

**Welcome to the Spring Boot E-Commerce Application** – a backend service for managing product categories in an e-commerce system. This project provides **RESTful APIs** to create, update, delete, and retrieve product categories efficiently.  

It is built using **Java Spring Boot**, integrated with an **H2 in-memory database**, and rigorously tested with **Postman** for seamless API interactions. The architecture is designed to be modular, scalable, and easily extendable for building a full-fledged e-commerce platform.

## 📌 Features  

✅ **Spring Boot Framework** – Fast and efficient backend development.  
✅ **H2 Database** – Lightweight and fast in-memory database for development and testing.  
✅ **Spring Data JPA** – Simplifies database operations.  
✅ **RESTful APIs** – Well-structured API endpoints for managing product categories.  
✅ **Postman API Testing** – Ensures seamless request handling.  
✅ **Maven Dependency Management** – Efficient project setup and build automation.  
✅ **Lightweight & Extendable** – Can be scaled for production-ready deployments.

## 🛠️ Technologies Used  

- **Java 17** – Modern Java for high performance.
- **Spring Boot** – Framework for enterprise-grade applications. 
- **Spring Data JPA** – ORM for database interactions.  
- **H2 Database** – In-memory storage for quick prototyping. 
- **Lombok** – Reduces boilerplate code for cleaner implementation.  
- **Maven** – Build and dependency management tool. 
- **Postman** – API testing and validation.  

## 📂 Project Structure  

```
📦 sb-ecom
 ┣ 📂 src/main/java/com/ecommerce/Project
 ┃ ┣ 📜 SbEcomApplication.java    # Main Spring Boot application
 ┃ ┣ 📜 Category.java             # Category entity class
 ┃ ┣ 📜 CategoryController.java   # REST API Controller for category management
 ┃ ┣ 📂 repositories
 ┃ ┃ ┗ 📜 CategoryRepository.java # JPA repository interface
 ┃ ┣ 📂 service
 ┃ ┃ ┣ 📜 CategoryService.java    # Service interface for business logic
 ┃ ┃ ┗ 📜 CategoryServiceImpt.java # Service implementation
 ┣ 📂 src/main/resources
 ┃ ┣ 📜 application.properties    # Spring Boot configuration file
 ┣ 📜 pom.xml                     # Project dependencies
```

## 🔥 API Endpoints  

| HTTP Method | Endpoint                   | Description             |
|------------|---------------------------|-------------------------|
| **GET**    | `/api/public/categories`   | Fetch all categories    |
| **POST**   | `/api/public/categories`   | Create a new category   |
| **PUT**    | `/api/public/categories/{id}` | Update an existing category |
| **DELETE** | `/api/public/categories/{id}` | Delete a category      |

## 🚀 Getting Started  

### 1️⃣ Clone the Repository  

```sh
git clone https://github.com/chinmaywali/SpringBoot-Ecommerce_Application.git
cd SpringBoot-Ecommerce_Application
```

### 2️⃣ Build & Run the Application  

```sh
mvn spring-boot:run
```

### 3️⃣ Access API via Postman  

- **Base URL:** `http://localhost:8080/api/public/categories`
- **Example POST Request:**  

```json
{
    "categoryName": "Clothing & Fashion"
}
```

## 🎯 Future Enhancements  

✅ **JWT Authentication** – Secure API access with user roles.  
✅ **Database Migration** – Replace H2 with MySQL/PostgreSQL for production.  
✅ **Additional Features** – Extend support for products, orders, and users.  
✅ **Swagger Documentation** – API documentation for better usability.  

---

📌 **Contributions Welcome!** Fork this repository, enhance features, and submit a pull request.  
💡 **Have Suggestions?** Open an issue and let's improve this together! 🚀
