package com.murilocb123.service_example.controllers;


import com.murilocb123.service_example.dto.ProductDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {


    @GetMapping("/list")
    public List<ProductDTO> list() {
        return List.of(
                new ProductDTO("Product 1", "Description 1", 100.0),
                new ProductDTO("Product 2", "Description 2", 200.0),
                new ProductDTO("Product 3", "Description 3", 300.0)
        );
    }
}
