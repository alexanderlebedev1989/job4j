package ru.job4j.oop;

import java.sql.SQLOutput;

public class Animal {
    public Animal() {
        super();
        System.out.println("load animal");
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        Predator predator = new Predator();
        Tiger tiger = new Tiger();
    }
}
