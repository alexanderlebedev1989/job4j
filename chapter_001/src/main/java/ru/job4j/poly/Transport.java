package ru.job4j.poly;

public interface Transport {
    public void iGo();

    public void take(int passenger);

    public int refuel(int fuel);
}
