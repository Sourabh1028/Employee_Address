<center>
<h1> Employee_Address </h1>
</center>
<center>
<a href="Java url">
    <img alt="Java" src="https://img.shields.io/badge/Java->=8-darkblue.svg" />
</a>
<a href="Maven url" >
    <img alt="Maven" src="https://img.shields.io/badge/maven-3.0.5-brightgreen.svg" />
</a>
</center>
This project is a User management system built using Spring Boot with Java.

---

## Framework Used
* Spring Boot

---

## Language Used
* Java

---

## Data Model

The user data model is defined in the User class, which has the following attributes:
```
UserId : unique identifier for each user
Name : name of the user
UserName : Organisation user name
Address : address of the user
Phone Number : Phone number of the user
```

---

## Data Flow

```
The user sends a request to the application through the API endpoints.
```
<center>
<font color="blue">
&#8595;</font>
<center>

```
The API receives the request and sends it to the appropriate controller method.
```
<center>
<font color="blue">
&#8595;</font>
<center>

```
The controller method makes a call to the method in service class.
```
<center>
<font color="blue">
&#8595;</font>
<center>

```
The method in service class builds logic and retrieves or modifies data from the database, which is in turn given to controller class
```

<center>
<font color="blue">
&#8595;</font>
<center>

```
The controller method returns a response to the API.
```
<center>
<font color="blue">
&#8595;</font>
<center>

```
The API sends the response back to the user.
```

---

## Functions used :-

### API Endpoints :-


* PostMapping: /addUser
```
In database we add a new user given through API.
```

* GetMapping: /getAllUser
```
This endpoint gives us the data of all users stored in our data baase
```

* GetMapping: "getUser/{userid}"
```
This endpoint returns data of specific user based on userid through API
```

* PutMapping
```
In database we update a user by userid given through API.
```

* DeleteMapping
```
In database we delete a user by userid given through API.
```

---

## Data structure Used
* ArrayList
```
We have used ArrayList data structure as a database to implement CRUD Operations 
```
---

## Project Summary

The Employee Address is a Spring Boot project written in Java that enables basic functionality for managing users. This project is built using the Spring Boot framework. The project uses ArrayList as the data structure to store and manage user data.

The project includes four main components, the Controller, the Service, the Dao, and the User class. The Controller class receives requests from the user interface layer and delegates them to the Service. The Service processes the request and retrieves or updates data from the Dao. The Dao uses an ArrayList data structure to store and manage user data, and the User class defines the user data model.
