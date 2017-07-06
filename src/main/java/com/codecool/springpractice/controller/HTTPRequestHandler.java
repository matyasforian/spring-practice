package com.codecool.springpractice.controller;

import com.codecool.springpractice.model.SampleModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

// Use code like this to serve webpages for browsers.
@Controller //A @Component that can have @RequestMapping. This is a "subannotation" of @Component
public class HTTPRequestHandler {

    private SampleModel myModel;

    @Autowired // Sample dependency injection
    public HTTPRequestHandler(SampleModel myModel) {
        this.myModel = myModel;
    }

    @RequestMapping("/greeting")
    public String requestThatReturnsTemplate(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", myModel.valami);
        return "greeting"; // The name of the template
    }

}
