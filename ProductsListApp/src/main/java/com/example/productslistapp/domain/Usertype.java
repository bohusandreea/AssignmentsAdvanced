package com.example.productslistapp.domain;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Embeddable
public class Usertype {

    private String usertype;

    public Usertype(){}
}
