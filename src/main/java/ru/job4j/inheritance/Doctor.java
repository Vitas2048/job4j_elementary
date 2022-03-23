package ru.job4j.inheritance;

public class Doctor extends Profession {
    private boolean seenCorps;

    public Doctor(String name, String surname, String education, String birthday, boolean seenCorps) {
        super(name, surname, education, birthday);
        this.seenCorps = seenCorps;
    }

    public void trueDoctor() {
    if (this.seenCorps) {
        System.out.println("This doctor can be more than doctor");
    }
    }
}
