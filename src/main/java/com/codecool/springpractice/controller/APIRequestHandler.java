package com.codecool.springpractice.controller;

import com.codecool.springpractice.database.DBHandler;
import com.codecool.springpractice.database.SampleORMEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// Use code like this to make an API, for e.g. mobile clients, AJAX calls,..
@RestController // A @Controller, where requests return plain strings. This is a "subannotation" of @Controller.
public class APIRequestHandler {

    private DBHandler dbHandler;

    @Autowired
    public APIRequestHandler(DBHandler dbHandler) {
        this.dbHandler = dbHandler;
    }

    @RequestMapping("/simple")
    public String queryDB(@RequestParam(value="name", required=false, defaultValue="Smith") String name) {

        dbHandler.deleteAll();
        dbHandler.saveSampleORMEntity(new SampleORMEntity("Jack", "Smith"));
        dbHandler.saveSampleORMEntity(new SampleORMEntity("Adam", "Johnson"));
        dbHandler.saveSampleORMEntity(new SampleORMEntity("Kim", "Smith"));
        dbHandler.saveSampleORMEntity(new SampleORMEntity("David", "Williams"));
        dbHandler.saveSampleORMEntity(new SampleORMEntity("Peter", "Davis"));

        String result = "";
        for(SampleORMEntity cust: dbHandler.findByLastName(name)){
            result += "<div>" + cust.toString() + "</div>";
        }
        return "This returns a simple String. Request param: " + name + "<br/>data from Database:<br/>" + result;
    }
}
