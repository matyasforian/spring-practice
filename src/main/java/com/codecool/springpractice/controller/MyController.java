package com.codecool.springpractice.controller;

import com.codecool.springpractice.model.SampleModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller //A Component that can have @RequestMapping. Automatically added to the Context.
public class MyController {

    private SampleModel myModel;

    @Autowired
    public MyController(SampleModel myModel) {
        this.myModel = myModel;
    }

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", myModel.valami);
        return "greeting"; // The name of the template
    }
}
