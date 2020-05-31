package com.adamprodev.steps;

import com.adamprodev.testBase.TestBase;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class StepsDemo {

    public StepsDemo(){

        System.out.println("Steps demo initialed");
    }

    public void stepDemoPrint(){

        System.out.println("Step demo print");
    }
}
