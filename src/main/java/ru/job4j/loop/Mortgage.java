package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 0;

        while ((amount + (amount * percent / 100)) >= salary) {
            amount = amount + (amount * percent / 100) - salary;
            year++;
        }
            if ((amount > 0) && (amount < salary)) {
                year = year + 1;
            } else {
                if ((amount + (amount * percent / 100)) <= salary) {
                    year = 1;
                }
            }
        return year;
    }
}