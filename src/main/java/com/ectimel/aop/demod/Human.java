package com.ectimel.aop.demod;

import org.springframework.stereotype.Component;

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

    public String getName() {
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
