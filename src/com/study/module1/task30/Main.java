package com.study.module1.task30;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите email :");
        String email = scanner.nextLine();
        System.out.println("Соответствует ли email ящику gmail.com или outlook.com?\n" + Gmail.isGmailOrOutlook(email));
    }
}
