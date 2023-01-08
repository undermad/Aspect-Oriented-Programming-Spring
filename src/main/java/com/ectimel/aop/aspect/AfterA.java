package com.ectimel.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AfterA {

    @Pointcut(
            "execution(* com.ectimel.aop.demo.AccountDAO.findAccounts(..))")
    public void accountDAOList() {
    }
    

    @After("execution(* com.ectimel.aop.demo.AccountDAO.findAccounts(..))")
    public void afterMethod(JoinPoint joinPoint){
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("Method name: " + methodSignature.getName());

        System.out.println("Executing @After(finally) method");


    }
}
