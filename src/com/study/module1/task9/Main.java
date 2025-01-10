package com.study.module1.task9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите возраст двух людей через запятую:");
        String input = scanner.nextLine();
        String[] ages = input.split(","); //создаём массив из разделенных по запятой возрастов
        if (ages.length != 2) {
            throw new IllegalArgumentException("Формат ввода не соответствует условию (число, число)");
        }
        byte age1 = Byte.parseByte(ages[0].trim());
        byte age2 = Byte.parseByte(ages[1].trim());
        System.out.println("Разница в возрасте:\n"+ CalcAgeDiff.getAgeDiff(age1, age2));
    }
}
