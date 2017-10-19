package com.codecool.springpractice.controller;

import com.codecool.springpractice.model.SampleModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

// Use code like this to serve webpages for browsers.

// A @Component that can have @RequestMapping annotation. Requests return templates.
// This is a "subannotation" of @Component
@Controller
public class HTTPRequestHandler {

    private SampleModel myModel;

    public HTTPRequestHandler(SampleModel myModel) {
        this.myModel = myModel;
    }

    // A sample how to return a template for a request. You can use the model parameter to
    // fill your template.
    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    public String greetingEndpoint(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        System.out.println("The URL param is: " + name);
        // This tells Thymeleaf how to fill the template.
        model.addAttribute("name", myModel.something);
        return "greeting"; // This returns a template in resources/template/greeting.html
    }

}
