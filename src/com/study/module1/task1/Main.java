package com.study.module1.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество купленных мониторов:");
        int monitors = scanner.nextInt();
        System.out.println("Введите количество программистов:");
        int programmers = scanner.nextInt();
        int monLeft = ITCompany.drawisMonitorsCounter(monitors, programmers);
        System.out.println("Количество мониторов, которые никому не достанутся:\n" + monLeft);
    }
}
