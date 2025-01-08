package com.study.module1.task25;

public class Oddnum {
    public static void printOddNumbers(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) { //определяем кол-во нечетных
             if (arr[i] % 2 != 0) {
                count++;
            }
        }
        int[] res = new int[count];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 != 0) {
                    res[k] = arr[i];
                    k++;
                }
            }
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]);
            if (i < res.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}