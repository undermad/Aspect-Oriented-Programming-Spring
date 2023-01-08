package com.ectimel.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(999)
public class BeforeAndPointcut {


    @Pointcut("execution(* com.ectimel.aop.demod.*.* (..))")
    public static void allClassInDemodPackage() {
    }

    @Before("allClassInDemodPackage()")
    public void printHello(JoinPoint joinPoint) {

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("Method signature: " + methodSignature);

        Object[] objects = joinPoint.getArgs();

        for (int i = 0; i < objects.length; i++) {
            System.out.println("Argument: " + objects[i].toString());
        }

        System.out.println("This advice can will be executed with any method in demod package.");
    }
}
