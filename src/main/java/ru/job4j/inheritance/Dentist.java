package ru.job4j.inheritance;

public class Dentist extends Doctor {
    private boolean canFixTeeth;

    public Dentist(String name,
                  String surname,
                  String education,
                  String birthday,
                  boolean seenCorps,
                  boolean canFixTeeth) {
        super(name, surname, education, birthday, seenCorps);
        this.canFixTeeth = canFixTeeth;
    }

     public void greatTeethMaster() {
        if (canFixTeeth) {
            System.out.println("It`s so good that he can fix teeth");
        } else {
            System.out.println("he better think about his teeth");
        }
    }
}
