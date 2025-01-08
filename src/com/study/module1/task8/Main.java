package com.study.module1.task8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число (расстояние от обратного слэша до нужной буквы в UNICODE):");
        int a = scanner.nextInt();
        Expr.charExpression(a);
    }
}
