package com.adamprodev.testBase;

import com.adamprodev.aspects.AspectStep;
import com.adamprodev.steps.Steps;
import com.adamprodev.steps.StepsDemo;
import org.junit.FixMethodOrder;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;


@Configuration
@EnableAspectJAutoProxy //need for Aspect working
//@ComponentScan( basePackages = { "com.adamprodev" }) //scan for init @autowired (evry class its @componet, or use @ContextConfiguration( classes ...

@RunWith(SpringRunner.class)
@ContextConfiguration( classes = {

        AspectStep.class, //if you have extend class with where to search Aspect so need to add here
        Steps.class,
        StepsDemo.class

})
//@ContextConfiguration(loader= AnnotationConfigContextLoader.class)


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestBase {

    @Autowired
    public Steps steps;

    @Autowired
    public StepsDemo stepsDemo;


}
