package com.Swong.SpringIoCTutorial;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("airtelBean")
@Primary
public class Airtel implements Sim {
    @Override
    public void calling() {
        System.out.println("Airtel Calling");
    }

    @Override
    public void data() {
        System.out.println("Airtel Data");
    }
}
