package com.study.module1.task17;

public class ArrayPrinting {
    public static void printArray(int[] numbers) {
        System.out.print("["); //печатаем скобку
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i != numbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");// Печатаем закрывающую квадратную скобку
    }
}
