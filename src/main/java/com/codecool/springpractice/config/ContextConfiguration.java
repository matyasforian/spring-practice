package com.codecool.springpractice.config;

        import org.springframework.context.annotation.ComponentScan;
        import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.codecool.springpractice.model") // Define which packages to scan for Components
public class ContextConfiguration {

/*
    //you can define custom constructors too
    @Bean
    public SampleModel getMyModel(){
        return new SampleModel(23, "valami");
    }
*/
}