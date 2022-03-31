package ru.job4j.oop;

public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " по дороге");
    }

    @Override
    public void wheels() {
        System.out.println("на резиновых колесах");
    }
}
