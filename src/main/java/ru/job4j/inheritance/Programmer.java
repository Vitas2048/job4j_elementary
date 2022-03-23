package ru.job4j.inheritance;

public class Programmer extends Engineer {
    private boolean computerMaster;

    public Programmer(String name, String surname, String education, String birthday, boolean canCountInHisMind, boolean computerMaster) {
        super(name, surname, education, birthday, canCountInHisMind);
        this.computerMaster = computerMaster;
    }

    public void hack() {
        if (this.computerMaster) {
            System.out.println("hacking is not problem");
        } else {
            System.out.println("he better not touch computer");
        }
    }
}
