package com.ectimel.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DemoAspect {

    @Before("execution(public void addAccount())")
    public void beforeAddAccount() {
        System.out.println("Here is your aspect @Before method.");
    }
}
