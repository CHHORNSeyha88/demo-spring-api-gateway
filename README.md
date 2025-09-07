Spring Cloud Gateway Demo ProjectThis repository contains a simple microservices project to demonstrate the two main ways of configuring routes in a Spring Cloud Gateway:Manual Routing: Using hardcoded URIs and predicates.Auto-Mapping with Eureka: Using a service registry to dynamically discover and route to services.Project StructureThe project is a Gradle multi-project build with three services:eureka-server: The service registry for all microservices.user-service: A simple microservice with a /users/{id} endpoint.product-service: A simple microservice with a /products/{id} endpoint.gateway-service: The API Gateway that routes requests to the microservices.PrerequisitesJava 17 or higherGradleSetup and Running the ProjectStep 1: Clone the Repositorygit clone [https://github.com/CHHORNSeyha88/demo-spring-api-gateway.git](https://github.com/CHHORNSeyha88/demo-spring-api-gateway.git)
cd demo-spring-api-gateway
Step 2: Build the ProjectYou can build all subprojects with a single command:./gradlew build
Step 3: Run the ServicesYou must run the services in a specific order. Each service should be started in its own terminal window.Start the Eureka Server:./gradlew :eureka-server:bootRun
Verify the server is running by navigating to http://localhost:8761 in your browser. You should see the Eureka Dashboard.Start the Microservices:./gradlew :user-service:bootRun
./gradlew :product-service:bootRun
Wait for a few moments, then check the Eureka Dashboard. You should see both USER-SERVICE and PRODUCT-SERVICE listed as UP.Start the API Gateway:./gradlew :gateway-service:bootRun
Step 4: Test the RoutesWith all services running, you can now test the two routing methods. Use curl or your web browser.Manual RoutingThese routes are defined in the gateway's application-manual.yml and use hardcoded ports.# Test user-service via manual route
curl http://localhost:8080/users/123

# Test product-service via manual route
curl http://localhost:8080/products/456
Auto-Mapping with EurekaTo test this, you'll need to use the application-auto.yml profile. Restart the gateway with this profile.# Restart the gateway using the 'auto' profile
./gradlew :gateway-service:bootRun --args='--spring.profiles.active=auto'
Now, test the auto-mapped routes. They should also work without any change to the URLs, as the gateway automatically maps and routes the requests.# Test auto-mapped user-service
curl http://localhost:8080/user-service/users/123

# Test auto-mapped product-service
curl http://localhost:8080/product-service/products/456
