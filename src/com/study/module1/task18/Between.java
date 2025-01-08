package com.study.module1.task18;

public class Between {
    public static int[] getSubArrayBetween(int[] numbers, int start, int end) {
        // Определяем размер нового массива
        int count = 0;
        for (int number : numbers) {
            if (number >= start && number <= end) {
                count++;
            }
        }
        // Создаем новый массив и заполняем его значениями между start и end
        int[] subArray = new int[count];
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= start && numbers[i] <= end) {
                subArray[index] = numbers[i];
                index++;
            }
        }
        return subArray;
    }
}