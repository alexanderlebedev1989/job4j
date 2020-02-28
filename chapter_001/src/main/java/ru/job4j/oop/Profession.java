package ru.job4j.oop;

public class Profession {
    private String name;
    private String surname;
    private String education;
    private int birthday;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getEducation() {
        return education;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    public int getBirthday() {
        return birthday;
    }
}
