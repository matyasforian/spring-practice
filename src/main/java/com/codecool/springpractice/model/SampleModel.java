package com.codecool.springpractice.model;

import org.springframework.stereotype.Component;

// This is a model. Use it to store data. (not in the database, use @Entity for that!)

// @Component that an instance of this should be created automatically by Spring and put into the context.
// This is called a Bean in the Java EE/Spring world.
@Component
public class SampleModel {

    public String valami;

    public SampleModel() {
        valami = "I AM THE MODEL!!!!!!!!!!!!!";
    }

}