package org.homework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GatewayServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(GatewayServiceApplication.class, args);
    }

//    @Bean
//    public RouteLocator myRoute(RouteLocatorBuilder builder){
//        return builder.routes()
//                .route("user_service",r-> r.path("/users/**")
//                        .uri("http://localhost:8081"))
//                .route("product_service", r-> r.path("/products/**")
//                        .uri("http://localhost:8082"))
//                .build();
//    }
//
//    @Bean
//    public RouteLocator myRoutes(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route(p -> p
//                        .path("/get")
//                        .filters(f -> f.addRequestHeader("Hello", "World"))
//                        .uri("http://httpbin.org:80"))
//                .build();
//    }

}