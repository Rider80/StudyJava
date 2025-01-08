package com.study.module1.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите цену и количества товара:"); //ввод как в примере
        String input = scanner.nextLine();
        String[] values = input.split(","); //создаём массив из разделенных по запятой данных
        if (values.length != 2) {
            throw new IllegalArgumentException("Формат ввода не соответствует условию (цена, количество)");
        }
        double price = Double.parseDouble(values[0]);
        int count = Integer.parseInt(values[1].trim());

        double finalprice = Calculation.priceCalculation(price, count);
        System.out.println("Итоговая цена:\n"+finalprice);
    }
}
