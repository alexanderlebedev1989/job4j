package ru.job4j.oop;

public class Cat {

    private String food;
    private String name;

    public void show() {
        System.out.println("Имя кота " + this.name + ", на завтрак он ел " + this.food);
    }

    public void eat(String meat) {
        this.food = meat;
    }
    public void giveNick(String nick) {
        this.name = nick;
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        System.out.println("Как зовут первого кота и что он ел на завтрак?");
        cat1.giveNick("Гав");
        cat1.eat("kotleta");
        cat1.show();
        Cat cat2 = new Cat();
        System.out.println("Как зовут второго кота и что он ел на завтрак?");
        cat2.giveNick("Черныш");
        cat2.eat("fish");
        cat2.show();
    }
}
