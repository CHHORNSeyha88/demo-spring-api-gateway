# Spring Cloud Gateway Demo Project

This repository contains a simple microservices project to demonstrate the two main ways of configuring routes in a Spring Cloud Gateway.

## Project Structure

The project is a Gradle multi-project build with three services:

* **`eureka-server`**: The service registry for all microservices.
* **`user-service`**: A simple microservice with a `/users/{id}` endpoint.
* **`product-service`**: A simple microservice with a `/products/{id}` endpoint.
* **`gateway-service`**: The API Gateway that routes requests to the microservices.

---

## Prerequisites

* Java 17 or higher
* Gradle

---

## Setup and Running the Project

### Step 1: Clone the Repository

```sh
git clone [https://github.com/CHHORNSeyha88/demo-spring-api-gateway.git](https://github.com/CHHORNSeyha88/demo-spring-api-gateway.git)
cd demo-spring-api-gateway


### Step 1: Build the Project

```You can build all subprojects with a single command:
./gradlew build


