package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void iGo() {
        System.out.println("Автобус едет в Санкт-Петербург.");
    }

    @Override
    public void take(int passenger) {
        System.out.println("В Уфу едет " + passenger);
    }

    @Override
    public int refuel(int fuel) {
        int priceLiter = 30;
        int totalPrice = fuel * priceLiter;
        return totalPrice;
    }
}
