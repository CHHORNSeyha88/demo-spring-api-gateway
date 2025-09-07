package org.homework.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Developed by ChhornSeyha
 * Date: 07/09/2025
 */

@RestController
public class ProductController {
    @GetMapping("/products/{id}")
    public String getProduct(@PathVariable String id) {
        return "Product " + id + " from product-service!";
    }
}
