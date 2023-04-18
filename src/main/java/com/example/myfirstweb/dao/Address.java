package com.example.myfirstweb.dao;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Address {
    String city;
    String area;
    public Address(String city, String area) {
        this.city = city;
        this.area = area;
    }
    public Address() {

    }
}
