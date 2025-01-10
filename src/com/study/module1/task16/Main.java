package com.study.module1.task16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input day of the week:");
        String weekday = scanner.nextLine();
        CalcWeekendTern.chekWeekend(weekday);
    }
}

