package ru.job4j.calculator;
import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double plus(double first, double second) {
        return splitting(first, second) + substraction(first, second);
    }

    public static double allSum(double first, double second) {
        return sum(first, second) + multiply(first, second) + splitting(first, second) + substraction(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Result : " + allSum(10, 20));
    }
}
