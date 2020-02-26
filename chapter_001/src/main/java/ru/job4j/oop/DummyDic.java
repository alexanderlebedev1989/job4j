package ru.job4j.oop;

public class DummyDic {

    public String engToRus(String eng) {
        String line = "Неизвестное слово " + eng;
        return line;
    }

    public static void main(String[] args) {
        DummyDic vocabulary = new DummyDic();
        String title = vocabulary.engToRus("диалектика");
        System.out.println(title);
    }
}
