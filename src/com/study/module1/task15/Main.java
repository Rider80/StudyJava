package com.study.module1.task15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input day of the week:");
        String weekDay = scanner.nextLine();
        System.out.println("Is Weekend:\n"+ Calcweekendif.isWeekend(weekDay));
    }
}
