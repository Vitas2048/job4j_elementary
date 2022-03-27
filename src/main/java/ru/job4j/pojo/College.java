package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Khagai Vitalii Victorovich");
        student.setGroup("Job4j");
        student.setDate("10.02.22");
        System.out.println(student.getFio() + " group:" + student.getGroup() + " Start:" + student.getDate());
    }
}
