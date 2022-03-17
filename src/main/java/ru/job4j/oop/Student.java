package ru.job4j.oop;

public class Student {
    public void music(String lyrics) {
        System.out.println("i can sing a song:" + lyrics);
    }

    public void song() {
        System.out.println("raz dva tri");
    }

    public static void main(String[] args) {
        Student petya = new Student();
        String song = "i believe i can fly";
        petya.music(song);
        petya.music(song);
        petya.music(song);
        petya.song();
        petya.song();
        petya.song();
    }
}
