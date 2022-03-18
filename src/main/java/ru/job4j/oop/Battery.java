package ru.job4j.oop;

public class Battery {
    public int load;

    public Battery(int load) {
        this.load = load;
    }

    public int getLoad() {
        return load;
    }

    public void exchange(Battery another) {
        another.load = another.load + this.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery b1 = new Battery(50);
        Battery b2 = new Battery(30);
        b2.exchange(b1);
        System.out.println(b1.load);
        System.out.println(b2.load);
    }
}
