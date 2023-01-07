package com.ectimel.aop.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(DemoConfig.class);

        AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);
        MembershipDAO membershipDAO = context.getBean("membershipDAO", MembershipDAO.class);


        Account account = new Account("Dominik", "God level");
        accountDAO.addAccount(account);
        System.out.println("-------------------------------------------------------");
        membershipDAO.someMethod();
        System.out.println("-------------------------------------------------------");
        System.out.println(membershipDAO.addSuperStar());

        context.close();

    }
}
