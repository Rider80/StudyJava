package com.study.module1.task12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int n = scanner.nextInt();
        System.out.println("Факториал равен:\n"+ Calcfactorialrec.factorial(n));
    }
}