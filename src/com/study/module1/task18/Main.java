package com.study.module1.task18;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите массив возврастающих чисел и два числа для границ начала (x1) и конца(x2) части " +
                "массива в формате {x,y,z,...}, x1, x2 :");
        String input = scanner.nextLine();
        input = input.replaceAll("[{}]", "");// Удаляем "{" и "}" из строки
        input = input.replaceAll("[ ]", "");// Удаляем пробелы из строки
        String[] numbersString = input.split(",");// Разделяем введенную строку на подстроки, используя разделители
        int[] numbers1 = new int[numbersString.length];// Создаем массив чисел и заполняем его значениями из строк
        for (int i = 0; i < numbersString.length; i++) {
            numbers1[i] = Integer.parseInt(numbersString[i].trim());
        }
        int[] numbers = new int[numbers1.length - 2]; // создаем массив для возрастающих чисел без 2х последних(там start и end)
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers1[i];
        }
        int start = Integer.parseInt(numbersString[numbersString.length - 2]); // определяем начало интервала
        int end = Integer.parseInt(numbersString[numbersString.length - 1]); // определяем конец интервала
        int[] subArray = Between.getSubArrayBetween(numbers, start, end); // вызываем метод для получения подмассива
        System.out.println("Результирующий подмассив:");
        System.out.print("[");
        for (int i = 0; i < subArray.length; i++) {
            System.out.print(subArray[i]);
            if (i < subArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}