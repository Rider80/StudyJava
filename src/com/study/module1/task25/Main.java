package com.study.module1.task25;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите массив чисел в формате [x,y,z,...] :");
        String input = scanner.nextLine();
        input = input.substring(1, input.length() - 1); // Удаляем скобки из введенной строки
        String[] numbersString = input.split(",");// Разделяем введенную строку на подстроки, используя запятую как разделитель
        int[] arr = new int[numbersString.length];// Создаем массив чисел и заполняем его значениями из строк
        for (int i = 0; i < numbersString.length; i++) {
            arr[i] = Integer.parseInt(numbersString[i].trim());
        }
        System.out.println("Нечетные элементы массива :");
        OddNum.printOddNumbers(arr);
    }
}
