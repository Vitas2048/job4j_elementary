package ru.job4j.inheritance;

public class Builder extends Engineer {
    private boolean canPlayMineCraft;

    public Builder(String name, String surname, String education, String birthday, boolean canCountInHisMind, boolean canPlayMineCraft) {
        super(name, surname, education, birthday, canCountInHisMind);
        this.canPlayMineCraft = canPlayMineCraft;
    }

    public void townBuilder() {
        if (this.canPlayMineCraft) {
            System.out.println("He can build a big towers");
        } else {
            System.out.println("he better trying to play minecraft better");
        }
    }
}
