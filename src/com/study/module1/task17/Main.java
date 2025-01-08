package com.study.module1.task17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите массив чисел в формате {x,y,z,...} :");
        String input = scanner.nextLine();
        if (input.equals("{}")) {
            System.out.println("[]");
        } else {
            input = input.substring(1, input.length() - 1); // Удаляем фигурные скобки из введенной строки
            String[] numbersString = input.split(",");// Разделяем введенную строку на подстроки, используя запятую как разделитель
            int[] numbers = new int[numbersString.length];// Создаем массив чисел и заполняем его значениями из строк
            for (int i = 0; i < numbersString.length; i++) {
                numbers[i] = Integer.parseInt(numbersString[i].trim());
            }
            System.out.println("Печатаем значения массива в консоль:");
            Arrayprinting.printArray(numbers);// Вызываем метод для печати массива
        }
    }
}