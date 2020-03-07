package ru.job4j.poly;

public interface Transport {
    public void go();

    public void take(int passenger);

    public int refuel(int fuel);
}
