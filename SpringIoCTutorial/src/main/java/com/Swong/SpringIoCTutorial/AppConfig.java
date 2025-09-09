package com.Swong.SpringIoCTutorial;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.Swong")
public class AppConfig {

    @Bean
    public Sim sim() {
        return new Airtel(); // Change to new Airtel to switch implementations
    }
}
