package ru.job4j.oop;

public class Airplane implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " Летает");
    }

    @Override
    public void wheels() {
        System.out.println("с помощью крыльев");
    }
}
