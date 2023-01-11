package com.ectimel.aop.demod;

import com.ectimel.aop.demo.Account;
import com.ectimel.aop.demo.AccountDAO;
import com.ectimel.aop.demo.DemoConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;
import java.util.logging.Logger;

public class Main {

    private static Logger logger = Logger.getLogger(Main.class.getName());


    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(DemoConfig.class);

        Human human = context.getBean("human", Human.class);
        Food food = new Food("Chicken");

        human.setName("Dominik");
        logger.info("********************");
        human.setRace("White");
        logger.info("********************");
        human.eat(food);
        logger.info("********************");
        logger.info("********************");
        logger.info("********************");
        logger.info("********************");
        logger.info("********************");

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


        logger.info("********************");
        logger.info("********************");
        logger.info("********************");
        logger.info("********************");
        logger.info("********************");

//        List<Account> accountList = accountDAO.findAccounts(b);
//        logger.info();("Number of accounts: " + accountList.size());

        logger.info("ACCOUNT AFTER MODIFICATION: ");
//        accountList.forEach(account1 -> logger.info();(account1.getName()));


        logger.info("AFTER THROWING DEMO");

        try {
            boolean b = true;
            accountDAO.findAccounts(b);
        } catch (Exception e){
            logger.info(String.valueOf(e));
        }


        boolean b = true;
        logger.info(human.getName(b));



    }
}
