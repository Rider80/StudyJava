package com.study.module1.task28;

public class Palindrome {
    public static boolean isPalindrome(String text) {
        boolean isP = true;
        int num = 0;
        text = text.replaceAll(" ", "");
        char[] arr = text.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            num++;
            if (arr[i] != arr[arr.length - num]) {
                isP = false;
                break;
            }
        }
        return isP;
    }
}
