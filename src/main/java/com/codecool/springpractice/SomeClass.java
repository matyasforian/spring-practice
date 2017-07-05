package com.codecool.springpractice;

import com.codecool.springpractice.model.SampleModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// this could be for example a Controller
@Component
public class SomeClass {

    @Autowired
    private SampleModel myModel;

    public String someFunction() {
        return "from model:" + myModel.valami;
    }
}
