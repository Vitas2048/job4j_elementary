package ru.job4j.inheritance;

public class Surgeon extends Doctor {
    private boolean canCutPeople;

    public Surgeon(String name, String surname, String education, String birthday, boolean seenCorps, boolean canCutPeople) {
        super(name, surname, education, birthday, seenCorps);
        this.canCutPeople = canCutPeople;
    }

    public void surgeon() {
        if (this.canCutPeople) {
            System.out.println("this person is real surger");
        } else {
            System.out.println("he better not touch people");
        }
    }
}
