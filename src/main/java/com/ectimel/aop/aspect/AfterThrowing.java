package com.ectimel.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AfterThrowing {


    @Pointcut(
            "execution(* com.ectimel.aop.demo.AccountDAO.findAccounts(..))")
    public void accountDAOList() {
    }

    @org.aspectj.lang.annotation.AfterThrowing(
            pointcut = "accountDAOList()",
            throwing = "e")
    public void throwException(JoinPoint joinPoint, Throwable e){

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("Throwing exception from " + methodSignature.getName() + " method.");

        System.out.println(e.toString());

    }

}
