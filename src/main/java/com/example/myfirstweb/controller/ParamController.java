package com.example.myfirstweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Controller
public class ParamController {

    //http://localhost:8080/param4?username=A&age=19
    @GetMapping("wtf")
    public String param4(String username, Integer age) {
        System.out.println(username+"============="+age);
        return "/index.jsp";
    }

    //http://localhost:8080/arrayParam?hobby=1&hobby=2&hobby=3
    @GetMapping("arrayParam")
    public String arrayParam(String[] hobby) {
        System.out.println(hobby);
        return "/index.jsp";
    }

    //http://localhost:8080/listParam?hobby=1&hobby=2&hobby=3
    @GetMapping("listParam")
    public String listParam(@RequestParam List<String> hobby) {
        for(String s: hobby) {
            System.out.println(s);
        }
        return "/index.jsp";
    }

    //http://localhost:8080/mapParam?hobby=1&funny=2&user=3
    @GetMapping("mapParam")
    public String listParam(@RequestParam Map<String, String> map) {
        for(String k : map.keySet()) {
            System.out.println(k + " : " + map.get(k));
        }
        return "/index.jsp";
    }
}
