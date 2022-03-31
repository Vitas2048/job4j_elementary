package ru.job4j.oop;

public class PolyUsage {
    public static void main(String[] args) {
        Vehicle bus = new Bus();
        Vehicle bus1 = new Bus();
        Vehicle airplane = new Airplane();
        Vehicle train = new Train();
        Vehicle[] vehicles = new Vehicle[]{bus, airplane, train, bus1};
        for (Vehicle v:vehicles) {
            v.move();
            v.wheels();
        }
    }
}
