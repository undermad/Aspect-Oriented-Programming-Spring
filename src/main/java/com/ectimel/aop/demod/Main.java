package com.ectimel.aop.demod;

import com.ectimel.aop.demo.DemoConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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

    }
}
