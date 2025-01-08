package com.study.module1.task21;

public class Mergas {
    public static int[] mergeAndSort(int[] firstArray, int[] secondArray) {
        int[] mergasArray = new int[firstArray.length + secondArray.length];//создаем результмассив длиной сумме длин соединяемых
        System.arraycopy(firstArray, 0, mergasArray, 0, firstArray.length);//копируем элементы первого в результирующий
        System.arraycopy(secondArray, 0, mergasArray, firstArray.length, secondArray.length);//копируем эл-ты второго в рез-й

        for (int i = 0; i < mergasArray.length - 1; i++) { //сортировка пузырьком
            for(int j = 0; j < mergasArray.length - i - 1; j++) {
                if(mergasArray[j + 1] < mergasArray[j]) {
                    int swap = mergasArray[j];
                    mergasArray[j] = mergasArray[j + 1];
                    mergasArray[j + 1] = swap;
                }
            }
        }
        return mergasArray;
    }
}
