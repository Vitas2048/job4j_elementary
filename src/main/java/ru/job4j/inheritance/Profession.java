package ru.job4j.inheritance;

public class Profession {
    private String name;
    private String surname;
    private String education;
    private String birthday;

    public Profession(String name, String surname, String education, String birthday) {
        this.name = name;
        this.surname = surname;
        this.education = education;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEducation() {
        return education;
    }

    public String getBirthday() {
        return birthday;
    }

    public static void main(String[] args) {
        Programmer vitaly = new Programmer("Vitaly", "Khagay", "magister", "24.11.97", true, true);
        vitaly.hack();
        System.out.println(vitaly.getEducation());
        System.out.println(vitaly.getBirthday());

        Surgeon vitaly1 = new Surgeon("Vitaly", "Khagay", "magister", "24.11.97", true, false);
        vitaly1.surgeon();
    }
}
