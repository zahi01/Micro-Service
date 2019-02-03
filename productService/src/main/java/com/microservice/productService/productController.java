package com.microservice.productService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class productController {
    @Autowired
    Configuration configuration;

    @GetMapping(value = "/product")
    public ProductDto getProduct(){
        return new ProductDto(configuration.getName(),configuration.getPrice());
    }
}
