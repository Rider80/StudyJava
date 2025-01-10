package com.study.module1.task29;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число (long) в двойных кавычках :");
        String number = scanner.nextLine();
        number = number.substring(1, number.length() - 1); // Удаляем скобки из введенной строки
        System.out.println("Результат вычисления :\n" + ParseAndSqrt.parseAndSqrt(number));
    }
}
