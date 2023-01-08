package com.ectimel.aop.aspect;

import com.ectimel.aop.demo.Account;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.util.List;

@Aspect
@Component
public class AfterReturningC {

    @Pointcut(
            "execution(* com.ectimel.aop.demo.AccountDAO.findAccounts(..))")
    public void accountDAOList() {
    }


    @AfterReturning(
            pointcut = "accountDAOList()",
            returning = "result")
    public void afterFindAccounts(JoinPoint joinPoint, List<Account> result) {

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("Method name: " + methodSignature);
        System.out.println("Printing result: ");
        result.forEach(account -> {
            System.out.println(account.getName() + " on level " + account.getLevel() + " all before modification and this line is called from @AfterReturning method.");
            account.setName(account.getName().toUpperCase());
        });

    }


}
