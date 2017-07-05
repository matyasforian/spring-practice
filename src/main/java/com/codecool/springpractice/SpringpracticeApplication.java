package com.codecool.springpractice;

import com.codecool.springpractice.config.ContextConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringpracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringpracticeApplication.class, args);

		// Initialize and setup the context
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(ContextConfiguration.class);
        ctx.refresh();
    }
}
