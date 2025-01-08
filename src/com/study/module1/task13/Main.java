package com.study.module1.task13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите возраст человека:");
        int age = scanner.nextInt();
        Calcgroup group = new Calcgroup(); //создаем объект класса, т.к. вызываем нестатический метод
        System.out.println("Номер группы:\n"+group.determineGroup(age));
    }
}
