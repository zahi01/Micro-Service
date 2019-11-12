package com.microservice.canal;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "product-service")
public interface proxProductService {

    @GetMapping(value = "/{p}")
    ProductDto getProducts(@PathVariable String p );



}
