package com.microservice.canal;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "product-service")
@RibbonClient(name = "product-service")
public interface proxProductService {

    @GetMapping(value = "/product")
    public ProductDto getProducts();
}
