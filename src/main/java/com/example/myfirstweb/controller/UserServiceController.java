package com.example.myfirstweb.controller;

import com.example.myfirstweb.service.UserService;
import org.springframework.context.ApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UserServiceController {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        ServletContext sce = request.getServletContext();
        ApplicationContext applicationContext = (ApplicationContext) sce.getAttribute("application");
        UserService userService = applicationContext.getBean(UserService.class);
        userService.transferMoney("tom", "lucy", 500);

    }

    public void destroy() {
    }
}
