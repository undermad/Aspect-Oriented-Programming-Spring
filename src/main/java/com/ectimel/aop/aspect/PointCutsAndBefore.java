package com.ectimel.aop.aspect;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class PointCutsAndBefore {

    @Pointcut("execution(* com.ectimel.aop.demod.*.* (..))")
    public static void allClassInDemodPackage() {
    }

    @Pointcut("execution(* set*(..))")
    public void anySetMethod() {
    }

    @Pointcut("execution(* get*(..))")
    public void anyGetMethod() {
    }


    @Before("anySetMethod() || anyGetMethod()")
    public void beforeGetOrSetMethod(){
        System.out.println("Standing at the frot of get or set method!");
    }

    @Before("allClassInDemodPackage() && !(anyGetMethod() || anySetMethod())")
    public void printWorld() {
        System.out.println("Everywhere except get and set methods.");
    }


}
