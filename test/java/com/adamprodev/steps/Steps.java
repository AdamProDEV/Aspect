package com.adamprodev.steps;

import com.adamprodev.Step;
import com.adamprodev.testBase.TestBase;
import org.springframework.stereotype.Component;

@Component
public class Steps {

    @Step("Descriprtion step 1")
    public void step1(){

        System.out.println("Step 1 running");
    }

    @Step("Descriprtion step 2")
    public void step2(){

        System.out.println("Step 2 running");
    }

    @Step("Descriprtion step 3")
    public void step3(){

        System.out.println("Step 3 running");
    }

    @Step("Descriprtion step 4")
    public void step4(String saySomething){

        System.out.println(saySomething);
    }




}
