package com.microservice.canal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ProcutController {

    @Autowired
    proxProductService proxy;
    RestTemplate restTemplate = new RestTemplate();


    @GetMapping(value = "/{p}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ProductDto getProduct(@PathVariable String p ){
        return proxy.getProducts(p);
    }

}
