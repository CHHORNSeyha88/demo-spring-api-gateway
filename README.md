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

---

2. You can build all subprojects with a single command
   ```sh
   ./gradlew build
   ```

Manual Routing
These routes are defined in the gateway's application-manual.yml and use hardcoded ports.

# Test user-service via manual route
curl http://localhost:8080/users/123

# Test product-service via manual route
curl http://localhost:8080/products/456

Auto-Mapping with Eureka
To test this, you'll need to use the application-auto.yml profile. Restart the gateway with this profile.

Now, test the auto-mapped routes. They will work without any change to the URLs, as the gateway automatically maps and routes the requests.

# Test auto-mapped user-service
curl http://localhost:8080/user-service/users/123

# Test auto-mapped product-service
curl http://localhost:8080/product-service/products/456



