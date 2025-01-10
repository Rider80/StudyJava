package com.study.module1.task21;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первый массив чисел в формате {x,y,z,...} :");
        String input1 = scanner.nextLine();
        if (input1.equals("{}")) {
            int[] firstArray = new int[0];
            System.out.println("Введите второй массив чисел в формате {x,y,z,...} :");
            String input2 = scanner.nextLine();
            input2 = input2.substring(1, input2.length() - 1); // Удаляем фигурные скобки из введенной строки
            String[] numbersString2 = input2.split(",");// Разделяем введенную строку на подстроки, используя запятую как разделитель
            int[] secondArray = new int[numbersString2.length];// Создаем массив чисел и заполняем его значениями из строк
            for (int i = 0; i < numbersString2.length; i++) {
                secondArray[i] = Integer.parseInt(numbersString2[i].trim());
            }

            int[] mergasArray = MergAndSort.mergeAndSort(firstArray, secondArray);
            System.out.println("Соединенный и отсортированный массив:");
            System.out.print("[");
            for (int i = 0; i < mergasArray.length; i++) {
                System.out.print(mergasArray[i]);
                if (i < mergasArray.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        } else {
            input1 = input1.substring(1, input1.length() - 1); // Удаляем фигурные скобки из введенной строки
            String[] numbersString1 = input1.split(",");// Разделяем введенную строку на подстроки, используя запятую как разделитель
            int[] firstArray = new int[numbersString1.length];// Создаем массив чисел и заполняем его значениями из строк
            for (int i = 0; i < numbersString1.length; i++) {
                firstArray[i] = Integer.parseInt(numbersString1[i].trim());
            }
            System.out.println("Введите второй массив чисел в формате {x,y,z,...} :");
            String input2 = scanner.nextLine();
            input2 = input2.substring(1, input2.length() - 1); // Удаляем фигурные скобки из введенной строки
            String[] numbersString2 = input2.split(",");// Разделяем введенную строку на подстроки, используя запятую как разделитель
            int[] secondArray = new int[numbersString2.length];// Создаем массив чисел и заполняем его значениями из строк
            for (int i = 0; i < numbersString2.length; i++) {
                secondArray[i] = Integer.parseInt(numbersString2[i].trim());
            }

            int[] mergasArray = MergAndSort.mergeAndSort(firstArray, secondArray);
            System.out.println("Соединенный и отсортированный массив:");
            System.out.print("[");
            for (int i = 0; i < mergasArray.length; i++) {
                System.out.print(mergasArray[i]);
                if (i < mergasArray.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }
}


