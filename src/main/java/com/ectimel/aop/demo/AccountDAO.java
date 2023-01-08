package com.ectimel.aop.demo;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AccountDAO {

    private List<Account> accountList;

    public AccountDAO() {
        this.accountList = new ArrayList<>();
    }

    public void addAccount(Account account) {

        accountList.add(account);
        System.out.println(account.getName() + " has been added.");
    }

    public List<Account> findAccounts(boolean b) {

        if(b == true){
            throw new RuntimeException("Buhaha.");
        }

        return this.accountList;

    }


}
