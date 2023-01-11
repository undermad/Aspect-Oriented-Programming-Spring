package com.ectimel.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.sql.Time;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

@Aspect
@Component
public class AroundA {

    Logger logger = Logger.getLogger(AroundA.class.getName());

    @Pointcut("execution(* com.ectimel.aop.demod.Human.getName(..))")
    public void getNamePath() {
    }

    @AfterReturning(value = "execution(* com.ectimel.aop.demod.Human.getName(..))", returning = "result")
    public void practice(JoinPoint joinPoint, String result){
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        logger.info("Name is: " + result);
        logger.info("Method name is:  " + methodSignature.getName());
    }


    @Around("execution(* com.ectimel.aop.demod.Human.getName(..))")
    public Object aroundMethod(ProceedingJoinPoint proceedingJoinPoint) {

        String methodName = proceedingJoinPoint.getSignature().getName();
        logger.info("Method name is: " + methodName);

        long beginning = System.currentTimeMillis();

        Object result;
        try {
            result = proceedingJoinPoint.proceed();
        } catch (Throwable e) {
            logger.info(e.getMessage());

            // You can simply write: throw e
            result = "Here is your exception handled with @Around!";
        }

        long resultTime = System.currentTimeMillis() - beginning;
        logger.info("Time to proceed: " + resultTime);


        return result;
    }

}
