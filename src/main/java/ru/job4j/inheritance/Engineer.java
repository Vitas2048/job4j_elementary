package ru.job4j.inheritance;

public class Engineer extends Profession {
    private boolean countInHisMind;

    public Engineer(String name, String surname, String education, String birthday, boolean countInHisMind) {
        super(name, surname, education, birthday);
        this.countInHisMind = countInHisMind;
    }

    public void goodMath() {
        if (this.countInHisMind) {
            System.out.println("Trully Engineer");
        } else {
                System.out.println("he better use calculator");
        }
    }
}
