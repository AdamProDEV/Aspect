package com.adamprodev;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

//This class usered if you dont want to put all in test base with all @autowired
@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = { "com.adamprodev" }) //need for tell there to search the @componet of Aspect
public class SpringContextAOPScan {

    //this class jus add to @ContextConfiguration in TestBase with all @Autowired
}
