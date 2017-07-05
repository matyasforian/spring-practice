package com.codecool.springpractice.model;

import org.springframework.stereotype.Component;

@Component // Denotes that an instance of this should be created automatically and put into the context
public class SampleModel {

    public String valami;

    public SampleModel() {
        valami = "I AM THE MODEL!!!!!!!!!!!!!";
    }
}
