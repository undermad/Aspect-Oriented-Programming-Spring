package com.ectimel.aop.demo;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

    public void addAccount(){
        System.out.println("Adding account!");
    }

}
