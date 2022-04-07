package ru.job4j.ex;

public class FactRec {
    public static int calc(int n) {
        int calculation = 0;
        if ((n == 0) || (n ==  1)) {
            calculation = 1;
        } else {
            calculation = calc(n - 1) * n;
        }
        return calculation;
    }

    public static void main(String[] args) {
        int rsl = calc(3);
        System.out.println(rsl);
    }
}