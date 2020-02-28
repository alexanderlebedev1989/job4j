package ru.job4j.oop;

import java.sql.SQLOutput;

public class Animal {

    public Animal() {

    }

     public Animal(String name) {
        super();
        System.out.println("load " + name);
     }

    public static void main(String[] args) {
        Predator predator = new Predator("predator");
        Tiger tiger = new Tiger("tiger");
    }
}
