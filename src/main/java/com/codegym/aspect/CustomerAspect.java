package com.codegym.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class CustomerAspect {
    @Before(value = "executeController()")
    public void beforeExecuteController(){
        System.out.println("Before");
    }

    @After(value = "executeController()")
    public void afterExecuteController(){
        System.out.println("After");
    }
    @Pointcut(value = "within(com.codegym.controller.*)")
    public void executeController(){}
}
