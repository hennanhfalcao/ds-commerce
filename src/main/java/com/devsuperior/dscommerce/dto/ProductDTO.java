package com.devsuperior.dscommerce.dto;


import com.devsuperior.dscommerce.entities.Product;
import org.springframework.beans.BeanUtils;

import java.util.HashSet;
import java.util.Set;

public class ProductDTO {

    private Long id;
    private String name;
    private String description;
    private Double price;
    private String imgUrl;


    public ProductDTO() {
    }

    public ProductDTO(Product entity) {
        BeanUtils.copyProperties(entity,this);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
