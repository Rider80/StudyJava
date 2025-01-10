package com.study.module1.task24;

import java.util.Arrays;

public class MergeAndSort {
    public static int[] mergeAndSort(int[] firstArray, int[] secondArray) {
        int[] mergasArray = new int[firstArray.length + secondArray.length];//создаем результмассив длиной сумме длин соединяемых
        System.arraycopy(firstArray, 0, mergasArray, 0, firstArray.length);//копируем элементы первого в результирующий
        System.arraycopy(secondArray, 0, mergasArray, firstArray.length, secondArray.length);//копируем эл-ты второго в рез-й

        Arrays.sort(mergasArray); //сортировка методом из класса Arrays
        return mergasArray;
    }
}
