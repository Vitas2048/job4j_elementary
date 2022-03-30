package ru.job4j.poly;

public class Bus implements Transport {

    double maxWeight;
    boolean workingEngine;

    @Override
    public void ride() {
        this.workingEngine = true;
    }

    @Override
    public void passengers(int passengers) {
    this.maxWeight = 120 * passengers;
    }

    @Override
    public double fuel(int fuel) {
        if (fuel >= 0) {
            fuel *= 47;
        }
        return fuel;
    }
}
