package com.adamprodev;

import com.adamprodev.testBase.TestBase;
import org.junit.Test;

public class AspectTest extends TestBase {


    @Test
    public void stepsTest(){

        steps.step1();
        steps.step2();
        steps.step3();
        steps.step4("This method have parameter");
//        stepsDemo.stepDemoPrint();
    }
}
