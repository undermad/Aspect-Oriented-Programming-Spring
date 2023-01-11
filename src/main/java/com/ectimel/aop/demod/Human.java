package com.ectimel.aop.demod;

import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class Human {

    private String name;
    private String race;

    public void eat(Food food){
        System.out.println("Eating " + food.getName() + ". Mniam mniam.");
    }

    public Human() {
    }

    public Human(String name, String race) {
        this.name = name;
        this.race = race;
    }

    public String getName(boolean b ){

        if(b){
            throw new RuntimeException("Here we are!");
        }

        return getName();
    }

    public String getName() {

        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }
}
