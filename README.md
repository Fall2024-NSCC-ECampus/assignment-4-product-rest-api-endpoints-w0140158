# Product REST API Endpoints

## Overview
This application is a Spring Boot-based REST API for managing products in an inventory system. The API provides endpoints for CRUD (Create, Read, Update, Delete) operations on products. It allows users to add new products, view all products, update existing products, and delete products by their ID.

## Technologies Used
- **Spring Boot**: For building the RESTful API.
- **Spring JPA**: For database interactions and ORM (Object-Relational Mapping) with an in-memory H2 database or MySQL.
- **H2 Database**: An in-memory database used for testing purposes (can be swapped with MySQL in production).
- **Postman**: For testing API endpoints during development.
- **Maven**: For managing project dependencies and building the application.

## API Endpoints

### 1. **Post Request (Create a Product)**
- **Endpoint:** `POST /api/v1/products`
- **Description:** Creates a new product in the inventory.
- **Request Body:**
  ```json
  {
    "name": "Product Name",
    "price": 19.99,
    "quantity": 100
  }
  ```
- **Response:** A newly created product object with assigned ID.

### 2. **Get Request (Retrieve All Products)**
- **Endpoint:** `GET /api/v1/products`
- **Description:** Retrieves a list of all products in the inventory.
- **Response:** A list of product objects with their details.

### 3. **Get By ID Request (Retrieve a Single Product)**
- **Endpoint:** `GET /api/v1/products/{id}`
- **Description:** Retrieves a specific product by its ID.
- **Response:** A single product object if found, otherwise a `404 Not Found` response.

### 4. **Update Request (Modify a Product)**
- **Endpoint:** `PUT /api/v1/products/{id}`
- **Description:** Updates the details of an existing product by its ID.
- **Request Body:**
  ```json
  {
    "name": "Updated Product Name",
    "price": 24.99,
    "quantity": 150
  }
  ```
- **Response:** The updated product object if the update is successful.

### 5. **Delete Request (Remove a Product)**
- **Endpoint:** `DELETE /api/v1/products/{id}`
- **Description:** Deletes a specific product from the inventory by its ID.
- **Response:** A `204 No Content` status code if the deletion is successful.

## Database
- **In-memory Database (H2)**: The application uses an in-memory H2 database for testing purposes. The database can be swapped for a production-ready relational database like MySQL by modifying the application configuration.

## How to Run the Application
1. **Clone the Repository:**
   ```bash
   git clone https://github.com/Fall2024-NSCC-ECampus/assignment-4-product-rest-api-endpoints-w0140158
