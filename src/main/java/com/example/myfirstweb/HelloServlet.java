package com.example.myfirstweb;

import com.example.myfirstweb.service.UserService;
import org.springframework.context.ApplicationContext;

import java.io.*;
import javax.servlet.ServletContext;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "accountServlet", value = "/account-servlet")
public class HelloServlet extends HttpServlet {
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