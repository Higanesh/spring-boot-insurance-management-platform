Spring Boot Insurance Management Platform Application

Prerequisites
Before you begin, you will need to install the following software:

XAMPP
Postman

Install XAMPP by downloading it from the official website and following the installation instructions.

Start XAMPP and make sure that Apache and MySQL servers are running.

Create a new database called policydb by executing the following SQL command:

CREATE DATABASE policydb;

git clone https://github.com/username/my-project.git

mvn spring-boot:run

Usage
You can use Postman to interact with the API. Here are some example API endpoints:

You can use the following JSON format for creating or updating a user:

{
"firstName": "John",
"lastName": "Doe",
"email": "johndoe@example.com",
"age": 30
}

EXAMPLE

GET http://localhost:9191/api/clients - Get all users

[
{
"clientId": 2,
"name": "Ganesh Gayakwad",
"dateOfBirth": "25/05/2000",
"address": "Suman Shakti Apt",
"contactInfo": "9.657750872E9"
},
{
"clientId": 52,
"name": "Rupesh Patil",
"dateOfBirth": "20/06/1998",
"address": "Shubhlaxmi Society",
"contactInfo": "7.028626285E9"
},
{
"clientId": 53,
"name": "Sagar Wankhade",
"dateOfBirth": "24/08/1999",
"address": "Sai Mohan Soc.",
"contactInfo": "7.038049589E9"
},
{
"clientId": 54,
"name": "Manish Rinaitkar",
"dateOfBirth": "14/04/2000",
"address": "Ambika Society",
"contactInfo": "8.605985933E9"
},
{
"clientId": 55,
"name": "Namdev Gayakwad",
"dateOfBirth": "26/11/1978",
"address": "Suman Shakti Apt",
"contactInfo": "9.099652647E9"
}
]

GET http://localhost:9191/api/clients/55 - Get user by ID

{
"clientId": 55,
"name": "Namdev Gayakwad",
"dateOfBirth": "26/11/1978",
"address": "Suman Shakti Apt",
"contactInfo": "9.099652647E9"
}

POST http://localhost:9191/api/clients - Create a new user

{
"clientId": 2,
"name": "Ganesh Gayakwad",
"dateOfBirth": "25/05/2000",
"address": "Suman Shakti Apt",
"contactInfo": "9657750872"
}

POST http://localhost:9191/api/multipleclients - Create multiple users

[
{
"clientId": 52,
"name": "Rupesh Patil",
"dateOfBirth": "20/06/1998",
"address": "Shubhlaxmi Society",
"contactInfo": "7028626285"
},
{
"clientId": 53,
"name": "Sagar Wankhade",
"dateOfBirth": "24/08/1999",
"address": "Sai Mohan Soc.",
"contactInfo": "7038049589"
},
{
"clientId": 54,
"name": "Manish Rinaitkar",
"dateOfBirth": "14/04/2000",
"address": "Ambika Society",
"contactInfo": "8605985933"
},
{
"clientId": 55,
"name": "Namdev Gayakwad",
"dateOfBirth": "26/11/1978",
"address": "Suman Shakti Apt",
"contactInfo": "9099652647"
}
]

PUT http://localhost:9191/api/clients/54 - Update user by ID

{
"clientId": 54,
"name": "manish ",
"dateOfBirth": "28/08/2003",
"address": "Suman Shakti Apt",
"contactInfo": "9724830501"
}

DELETE http://localhost:9191/api/clients/55 - Delete user by ID

Client removed !! 55


