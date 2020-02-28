package ru.job4j.oop;

public class Animal {

    public Animal() {

    }

     public Animal(String name) {
        super();
        System.out.println("load animal");
     }

    public static void main(String[] args) {
        Predator predator = new Predator();
        Tiger tiger = new Tiger();
    }
}
