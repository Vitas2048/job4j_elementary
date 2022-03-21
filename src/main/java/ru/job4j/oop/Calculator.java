package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int a) {
        return a - x;
    }

    public int divide(int a) {

        return a / x;
    }

    public int sumAllOperation(int a) {
        return sum(a) + multiply(a) + minus(a) + divide(a);
    }

    public static void main(String[] args) {
        int i = sum(5);
        System.out.println("Demonstration sum(5) static method: " + i);
        int i1 = minus(4);
        System.out.println("Demonstration minus(4) static method: " + i1);
        Calculator calculator = new Calculator();
        System.out.println("Demonstration divide(15) method: " + calculator.divide(15));
        System.out.println("Demonstration sumAllOperations(20) method: " + calculator.sumAllOperation(20));
    }
}