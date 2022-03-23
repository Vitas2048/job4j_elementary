package ru.job4j.inheritance;

public class Child extends Parent {

    private String patronymic;

    public Child(String name, int age, String patronymic) {
        super(name, age);
        this.patronymic = patronymic;
    }

    public Child(String patronymic) {
        super();
        this.patronymic = patronymic;
    }

    public static void main(String[] args) {
        Parent lola = new Parent("Lola", 25);
        Child lolek = new Child("lolek", 15, "lolkovich");
        System.out.println(lolek.patronymic);
    }
}
