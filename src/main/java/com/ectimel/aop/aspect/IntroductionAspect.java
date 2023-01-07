package com.ectimel.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class IntroductionAspect {

    @Before("execution(public void addAccount(com.ectimel.aop.demo.Account, ..))")
    public void beforeAddAccount() {
        System.out.println("Here is your aspect @Before method with injection.");
    }

    @Before("execution(public void com.ectimel.aop.demo.MembershipDAO.someMethod())")
    public void beforeMembership() {
        System.out.println("Before membership");
    }

    @Before("execution(* add*(..))")
    public void beforeWithStar() {
        System.out.println("*****");
    }

    @Before("execution(* add*())")
    public void superStar() {
        System.out.println("*******************************");
    }

    @Before("execution(* com.ectimel.aop.demo.*.*(..))")
    public void spamMethod() {
        System.out.println("SPAM WHEN EVER YOU CALL ANY METHOD ALALALALALALSDLASLA");
    }
}
