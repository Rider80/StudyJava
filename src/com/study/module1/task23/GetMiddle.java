package com.study.module1.task23;

public class GetMiddle {
    public static int[] getArrayMiddle(int[] numbers){
        if (numbers.length % 2 == 0) {
            int[] subArray = new int[2];
            subArray[0] = numbers[numbers.length / 2 - 1];
            subArray[1] = numbers[numbers.length / 2];
            return subArray;
        }
        else {
            int[] subArray = new int[1];
            subArray[0] = numbers[numbers.length / 2];
            return subArray;
        }
    }
}
