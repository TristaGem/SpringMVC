package com.example.myfirstweb.dao;

import lombok.Getter;
import lombok.Setter;

@Getter
//@Setter
public class User {

    String username;
    Integer age;
    String[] hobbies;
    String birthday;
    Address address;

    public User(String username, Integer age, String[] hobbies, String birthday, Address address) {
        this.username = username;
        this.age = age;
        this.hobbies = hobbies;
        this.birthday = birthday;
        this.address = address;

    }
    public User() {

    }

    public String toString() {
        return this.username + this.birthday + this.age.toString();
    }
}
