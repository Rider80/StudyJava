package com.study.module1.task10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int n = scanner.nextInt();
        System.out.println("Является ли число по абсолютной величине степенью двойки:\n"+Ispower.isPowerOfTwo(n));
    }
}
