package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[5];
        names[0] = "Петр Арсентьев";
        names[1] = "Коробейников Стас";
        names[2] = "Карташова Елена";
        names[3] = "Хагай Виталий";
        names[4] = "Фамилия Имя";
        for (int i = 0; i < 5; i++) {
            System.out.println(names[i]);
        }
     }
}
