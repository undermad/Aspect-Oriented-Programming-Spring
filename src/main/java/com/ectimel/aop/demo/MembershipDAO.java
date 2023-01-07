package com.ectimel.aop.demo;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {

    public void someMethod() {
        System.out.println("Here is your membership!");
    }

    public String addSuperStar(){
        return this.getClass() + " superStar method";
    }

}
