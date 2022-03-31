package ru.job4j.oop;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " Ездит по рельсам");
    }

    @Override
    public void wheels() {
        System.out.println("с помощью специальных металлических колес");
    }
}
