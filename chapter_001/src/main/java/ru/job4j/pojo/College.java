package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Aleksandr");
        student.setSurname("Lebedev");
        student.setPatronymic("Sergeevich");
        student.setGroup("commerce");
        student.setDate(2010);

        System.out.print(student.getSurname() + " " + student.getName() + " " + student.getPatronymic());
        System.out.println(" entered college " + student.getDate() + " age" + " on the " + student.getGroup() + ".");
    }
}
