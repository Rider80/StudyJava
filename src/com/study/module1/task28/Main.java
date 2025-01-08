package com.study.module1.task28;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку :");
        String text = scanner.nextLine().replaceAll("[^a-zA-Z0-9]", "").toLowerCase();// Вводим текст
        // и переводим все буквы в нижний регистр и даляем все лишние символы из строки
        System.out.println("Является ли строка палиндромом?\n"+Palindrome.isPalindrome(text));
    }
}
