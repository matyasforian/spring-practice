package com.codecool.springpractice.config;

        import org.springframework.context.annotation.ComponentScan;
        import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.codecool.springpractice") // this is not so nice, put everything thats in a context into a subpackage
public class ContextConfiguration {

/*
you can define custom constructors too
    @Bean
    public MessageService getMessageService(){
        return new EmailService(23, "valami");
    }
*/
}