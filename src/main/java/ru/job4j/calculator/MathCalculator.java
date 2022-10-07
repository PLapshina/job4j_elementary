package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double subtractAndDivide(double first, double second) {
        return subtract(first, second)
                + divide(first, second);
    }

    public static double sumOfAllArithmeticOperations(double first, double second) {
        return sum(first, second)
                + multiply(first, second)
                + subtract(first, second)
                + divide(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета суммы значений сложения и умножения равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета суммы значений вычитания и деления равен: " + subtractAndDivide(10, 20));
        System.out.println("Результат расчета суммы всех арифметических операций равен: " + sumOfAllArithmeticOperations(10, 20));
    }
}
