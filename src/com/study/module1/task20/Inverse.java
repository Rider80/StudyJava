package com.study.module1.task20;

public class Inverse {
    public static int[] inverseArray(int[] numbers) {
        int[] subArray = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            int tmp = numbers[i];
            subArray[i] = numbers[numbers.length - i - 1];
            numbers[numbers.length - i - 1] = tmp;
        }
        return subArray;
    }
}
