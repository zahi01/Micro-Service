package com.microservice.productService;


import java.io.Serializable;

public class ProductDto implements Serializable {
    private  static  final  long serialVersionUID =  1350092881346723535L;

    private String name;
    private Double price;


    public ProductDto(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
