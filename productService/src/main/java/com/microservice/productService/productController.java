package com.microservice.productService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class productController {
    @Autowired
    Configuration configuration;

    @GetMapping(value = "/{p}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ProductDto getProduct(@PathVariable String p ){
        return new ProductDto("test",100d);
    }


}
