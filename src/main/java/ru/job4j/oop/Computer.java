package ru.job4j.oop;

public class Computer {

    private boolean multimonitor;
    private int ssd;
    private String cpu;

    public Computer() {
        multimonitor = true;
        ssd = 500;
        cpu = "AMD RYZEN 7 5700G";

    }

    public Computer(boolean multimonitor, int ssd, String cpu) {
        this.multimonitor = multimonitor;
        this.cpu = cpu;
        this.ssd = ssd;
    }

    public Computer(int ssd, String cpu) {
        this.ssd = ssd;
        this.cpu = cpu;
    }

    public Computer(boolean multimonitor, double ssd, String cpu) {
        this.multimonitor = multimonitor;
        this.ssd = (int) ssd;
        this.cpu = cpu;
    }

    public void printInfo() {
        System.out.println("Много мониторов " + multimonitor);
        System.out.println("SSD " + ssd + "GB");
        System.out.println("Модель CPU " + cpu);
    }

    public static void main(String[] args) {
        Computer computer = new Computer(true, 500, "AMD RYZEN 7 5700G");
        computer.printInfo();
        Computer computer1 = new Computer();
        computer1.printInfo();
    }
}
