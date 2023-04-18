package com.example.myfirstweb.controller;

import com.example.myfirstweb.service.QuickService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class QuickController {
    @Autowired
    private QuickService quickService;

    @RequestMapping("/funny")
    public String funny() {
        return "/index.jsp";
    }

    @RequestMapping("/param1")
    public String param1(String username, Integer age) {
        System.out.println(username+"============="+age);
        return "/index.jsp";
    }

    @RequestMapping("/param12")
    public String param12(String username, Integer age) {
        System.out.println(username+"============="+age);
        return "/index.jsp";
    }
}
