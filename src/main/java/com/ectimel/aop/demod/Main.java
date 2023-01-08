package com.ectimel.aop.demod;

import com.ectimel.aop.demo.Account;
import com.ectimel.aop.demo.AccountDAO;
import com.ectimel.aop.demo.DemoConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(DemoConfig.class);

        Human human = context.getBean("human", Human.class);
        Food food = new Food("Chicken");

        human.setName("Dominik");
        System.out.println("********************");
        human.setRace("White");
        System.out.println("********************");
        human.eat(food);
        System.out.println("********************");
        System.out.println("********************");
        System.out.println("********************");
        System.out.println("********************");
        System.out.println("********************");

        Account account = new Account("First", "Basic");
        Account account2 = new Account("Second", "Basic");
        Account account3 = new Account("Third", "Basic");
        Account account4 = new Account("Fourth", "Basic");
        Account account5 = new Account("Fifth", "Basic");

        AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);

        accountDAO.addAccount(account);
        accountDAO.addAccount(account2);
        accountDAO.addAccount(account3);
        accountDAO.addAccount(account4);
        accountDAO.addAccount(account5);


        System.out.println("********************");
        System.out.println("********************");
        System.out.println("********************");
        System.out.println("********************");
        System.out.println("********************");

//        List<Account> accountList = accountDAO.findAccounts(b);
//        System.out.println("Number of accounts: " + accountList.size());

        System.out.println("ACCOUNT AFTER MODIFICATION: ");
//        accountList.forEach(account1 -> System.out.println(account1.getName()));

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();


        System.out.println("AFTER THROWING DEMO");
        System.out.println();

        try {
            boolean b = true;
            accountDAO.findAccounts(b);
        } catch (Exception e){
            System.out.println(e);
        }






    }
}
