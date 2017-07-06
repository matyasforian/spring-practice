package com.codecool.springpractice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// Use code like this to make an API, for e.g. mobile clients, AJAX calls,..
@RestController // A @Controller, where requests return plain strings. This is a "subannotation" of @Controller.
public class APIRequestHandler {

    @RequestMapping("/simple")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name) {
        return "This just returns a simple String. Request param: " + name;
    }
}
