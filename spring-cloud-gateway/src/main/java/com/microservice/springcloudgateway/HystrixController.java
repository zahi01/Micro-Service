package com.microservice.springcloudgateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fallback")
public class HystrixController {

    @GetMapping(value = "/first")
    public String fallBack(){
        return "this is a fallbackkkkkk";
    }
}
