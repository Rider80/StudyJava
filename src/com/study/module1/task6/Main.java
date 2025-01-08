package com.study.module1.task6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите площадь круга:");
        double area = scanner.nextDouble();
        CalcRadius.calcCircleRadius(area);
    }
}
