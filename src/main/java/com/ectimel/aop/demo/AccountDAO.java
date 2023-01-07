package com.ectimel.aop.demo;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

    public void addAccount(Account account){
        System.out.println(account.getName() + " has been added.");
    }

}
