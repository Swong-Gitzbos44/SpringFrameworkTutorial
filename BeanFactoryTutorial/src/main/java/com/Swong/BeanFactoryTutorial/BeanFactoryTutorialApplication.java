package com.Swong.BeanFactoryTutorial;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class BeanFactoryTutorialApplication {

	public static void main(String[] args) {
        SpringApplication.run(BeanFactoryTutorialApplication.class, args);

        // Creating object in a spring container (Beans)
        BeanFactory factory = new ClassPathXmlApplicationContext("bean-factory-demo.xml");
        Student student = (Student) factory.getBean("student");

        System.out.println(student);
	}
}
