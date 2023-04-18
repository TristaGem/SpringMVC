package com.example.myfirstweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class RestController {
    @GetMapping("/user/{id}")
    public String getUser(@PathVariable("id") Integer id) {
        System.out.println("user's id is " + id.toString());
        return "/index.jsp";
    }

    @PostMapping("/uploadFile")
    public String uploadFile(@RequestBody MultipartFile myfile) {
        System.out.println(myfile);
        return "/index.jsp";
    }
}
