package br.com.simplespring.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/products")
public class ProductController {

    @GetMapping
    public ResponseEntity<String> products() {
        return ResponseEntity.ok("Products List");
    }
}
