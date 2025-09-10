package com.gfg.ApplicationContextTutorial;

import com.gfg.ApplicationContextTutorial.config.AppConfig;
import com.gfg.ApplicationContextTutorial.domain.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// Class
@SpringBootApplication
public class ApplicationContextTutorialApplication {

    // Main driver method
	public static void main(String[] args) {

        // Creates the container, creates beans, manages dependency injection and life cycle of those beans.
        // This is done using @SpringBootApplication annotation.
        ApplicationContext context = SpringApplication.run(ApplicationContextTutorialApplication.class, args);

        Student student = context.getBean(Student.class);

        // Print and display
        System.out.println(student);
	}

}
