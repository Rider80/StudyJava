package com.study.module1.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите a:");
        double a = scanner.nextDouble();
        System.out.println("Введите b:");
        double b = scanner.nextDouble();
        System.out.println("Введите c:");
        double c = scanner.nextDouble();
        boolean isTrue = Expression.doubleExpression(a, b, c);
        System.out.println("Правда ли, что a + b = c?\n" + isTrue);
    }
}
