package com.Swong.SpringIoCTutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@SpringBootApplication
@Component
public class SpringIoCTutorialApplication {

    @Autowired
    @Qualifier("jioBean") // Specify the bean name
    private Sim sim;

    public void useSim() {
        sim.calling();
        sim.data();
    }

	public static void main(String[] args) {
        SpringApplication.run(SpringIoCTutorialApplication.class, args);

        // Load the Spring IoC container using Java-based configuration
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        SpringIoCTutorialApplication mobile = context.getBean(SpringIoCTutorialApplication.class);
        mobile.useSim();
	}
}
