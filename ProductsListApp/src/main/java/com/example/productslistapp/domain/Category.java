package com.example.productslistapp.domain;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Embeddable
public class Category {

    private String category;

    @Embedded
    private Usertype usertype;

    public Category() {}
}
