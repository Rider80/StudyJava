package com.study.module1.task27;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число в двойных кавычках :");
        String str = scanner.nextLine();
        str = str.substring(1, str.length() - 1); // Удаляем скобки из введенной строки
        ParseAndPrint.parseAndPrintNumber(str);
    }
}
