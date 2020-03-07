package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void go() {
        System.out.println("Автобус едет в Санкт-Петербург.");
    }

    @Override
    public void take(int passenger) {
        System.out.println("В Санкт-Петербург едет " + passenger);
    }

    @Override
    public int refuel(int fuel) {
        int priceLiter = 30;
        int totalPrice = fuel * priceLiter;
        return totalPrice;
    }
}
