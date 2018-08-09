package com.sysco.ordermgmt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
public class OrderController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String index(HttpServletResponse response) {
        System.out.println("working");
        return "Hello World! test 1234";
    }

}