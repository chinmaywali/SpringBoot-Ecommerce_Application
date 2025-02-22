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

## 📸 Screenshots & Demo  

### **1️⃣ H2 Database Connection**  
_Here's a screenshot of the H2 database connection and the data stored in the categories table._  
| H2 DataBase | Test Connection Successful | 
| ------- | ------- |
|![Screenshot (463)](https://github.com/user-attachments/assets/f3ca2249-93b1-451a-8e6e-c53eb5ddc941) |![Screenshot (464)](https://github.com/user-attachments/assets/9a44815a-0789-4eec-92ae-f70d46466649) |

| View Tables | Initial Query | 
| ------- | ------- |
|![Screenshot (466)](https://github.com/user-attachments/assets/46ac0ca2-c442-4db0-9feb-e5dd3903b364)|![Screenshot (467)](https://github.com/user-attachments/assets/f8473264-fd27-4def-b02a-660f051bc94b)|

### **2️⃣ API Calls in Postman** 

#### **📤 Fetch All Categories (GET Request)**  
- **EndPoint:** `http://localhost:8080/api/public/categories`
- _Response:_  initially empty
  
```json
[]
```
![Screenshot (474)](https://github.com/user-attachments/assets/f571aef5-59da-4f63-831a-9d1d6ebdb6e3)

#### **📥 Create Category (POST Request)**  
- **EndPoint:** `http://localhost:8080/api/public/categories`
- _Request Payload:_ add one by one [Post one by one]
```json

{
    "categoryName": "Clothing & Fashion"
}
--------------------
{
    "categoryName": "Electronics"
}
--
{
    "categoryName": "Fresh Fruits & Vegetables"
}

{
    "categoryName": "Footwear"
}

```  
_Response:_  
```json
{
   "id": 1,
   "categoryName": "Clothing & Fashion"
}

{
    "id": 2,
     "categoryName": "Electronics"
}

{
     "id": 3,
     "categoryName": "Fresh Fruits & Vegetables"
}

{
     "id": 4,
     "categoryName": "Footwear"
}

```
| Adding Clothing & Fashion Category | Adding Electronics Category | 
| ------- | ------- |
|![Screenshot (475)](https://github.com/user-attachments/assets/5a15fe91-3944-4e92-b218-ff5924c08823) |![Screenshot (477)](https://github.com/user-attachments/assets/2196e95f-6105-4169-8654-fc0aaa3b54e7)|

| Adding Fresh Fruits & Vegetables Category | Adding Footwear Category | 
| ------- | ------- |
|![Screenshot (478)](https://github.com/user-attachments/assets/f70efc59-2d0d-4b0b-b99b-4fb776ef23b4) |![Screenshot (479)](https://github.com/user-attachments/assets/404da8cf-6a7f-456a-ac15-cee2b5ae7af7)|

#### **📤 Fetch All Categories (GET Request)**  
_Response:_  
```json
[
     {
        "id": 1,
        "categoryName": "Clothing & Fashion"
     },

     {
        "id": 2,
        "categoryName": "Electronics"
     },

     {
         "id": 3,
         "categoryName": "Fresh Fruits & Vegetables"
     },

     {
        "id": 4,
        "categoryName": "Footwear"
     }

]
```  
![Screenshot (480)](https://github.com/user-attachments/assets/cc9fe312-e655-4af5-88fc-eb704d752ccd)

#### **📝 Update Category (PUT Request)**  
_Request:_  Updating category name of  the category with Category id 3.. i.e Fresh Fruits & Vegetables to Home & Kitchen
```json
{
    "categoryName": "Home & Kitchen"
}
```  
_Response:_  
```json
{
    "id": 3,
    "categoryName": "Home & Kitchen"
}
```

| Updating the category with id 3 | Updated | 
| ------- | ------- |
|![Screenshot (481)](https://github.com/user-attachments/assets/0bc9ef9c-c086-41f7-bc81-f438bd274d4f)|![Screenshot (482)](https://github.com/user-attachments/assets/56fa6e72-a6b1-43e0-9e87-31039ac4b192)|


#### **🗑️ Delete Category (DELETE Request)**  
_Response:_  Delete the category with CategoryId 2 
```json
{
    "message": "Category deleted successfully"
}
```
| Delete the category with CategoryId 2  | Deleted | 
| ------- | ------- |
|![Screenshot (483)](https://github.com/user-attachments/assets/cceacd18-736f-4add-8377-e3d10ceff43a) |![Screenshot (485)](https://github.com/user-attachments/assets/805a6205-4f42-45ee-899e-4ea28e82c98a)|

---

## 🎯 Future Enhancements  

✅ **JWT Authentication** – Secure API access with user roles.  
✅ **Database Migration** – Replace H2 with MySQL/PostgreSQL for production.  
✅ **Additional Features** – Extend support for products, orders, and users.  
✅ **Swagger Documentation** – API documentation for better usability.  

---

📌 **Contributions Welcome!** Fork this repository, enhance features, and submit a pull request.  
💡 **Have Suggestions?** Open an issue and let's improve this together! 🚀
