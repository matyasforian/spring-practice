package com.codecool.springpractice.model;

import org.springframework.stereotype.Component;

// This is a model. Use it to store data.
@Component // Denotes that an instance of this should be created automatically and put into the context.
public class SampleModel {

    public String valami;

    public SampleModel() {
        valami = "I AM THE MODEL!!!!!!!!!!!!!";
    }
}
