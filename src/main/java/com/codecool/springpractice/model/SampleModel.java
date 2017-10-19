package com.codecool.springpractice.model;

import org.springframework.stereotype.Component;

// This is a model. Use it to store data. (not in the database, use @Entity for that!)

// @Component means that an instance of this should be created automatically by Spring and put into the context.
// This is called a Bean in the Java EE/Spring world.
@Component
public class SampleModel {

    public String something;

    public SampleModel() {
        something = "I AM THE MODEL!!!!!!!!!!!!!";
    }

}