package com.microservice.canal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class acceuil {

    @Autowired
    proxProductService proxy;

    @GetMapping(value = "/acceuil")
    public ProductDto getProduct(){
        return proxy.getProducts();
    }
}
