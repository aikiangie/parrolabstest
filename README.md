# Parrolabs
## Java Developer Exam 

The purpose of this exam is to measure the developer’s technical knowledge and creativity to  build a web application SOA architecture layer focusing on database design and back-end  development. 
The architecture layer will be built to support a simple order management system to control  orders placed from customers. It must include the following: 

1. CRUD for customers and products 
2. ADD and DELETE customer orders 
3. Search customers, products, and orders 
4. Search order details 

**Information required for each entity**
1. Customer (Name, phone, email, primary shipping address) 
2. Shipping address (Street and number, city, state, zip code, country) 
3. Product (ID, description, price, weight) 
4. Order: Order Number, date, customer, shipping address, payment type (cash, credit card,  check, other), list of products with quantities, total order value 

**Business Logic**
1. Customer’s phone and email must be unique 
2. Product ID must be unique 
3. Order number must be unique 
4. An order can contain multiple products and must include at least one product 5. Order’s total value is a sum of the order’s product/s prices 
6. A product cannot be deleted after it has been used in an order 
7. A customer cannot be deleted after it has been used in an order 

**Architectural Requirements**
1. Database: Mysql 
2. Back-end: Java SE 1.8 
3. Front-end: No front end required 
4. Swagger like interface to test and use each endpoint is a big plus 
5. Architecture style: Microservice SOA oriented architecture 
6. Testing: Automated/Unit tests considered a big plus but not mandatory

**Implementation**
Framework: Spring boot 2.5.5
Database: Mysql 8.0.26

**How to test**
1) Use swagger: http://localhost:8080/swagger-ui.html
2) Use postman collection located in src/test/PostmanParrolabsTest.postman_collection.json

**Pendings**
1) Payment type validations (enumeration)
2) Unit tests
3) Add search criterias. Find only available by id