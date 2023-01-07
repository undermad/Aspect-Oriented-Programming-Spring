package com.ectimel.aop.demod;

public class Food {
    String name;

    @Override
    public String toString() {
        return this.name + " type of " + this.getClass();
    }


    public Food() {
    }

    public Food(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
