package com.study.module1.task10;

public class Ispower {
    public static boolean isPowerOfTwo(int n){
        boolean isP = false;
        if (Math.abs(n)>0 && (Math.abs(n)&(Math.abs(n)-1))==0){
            isP = true;
        }
        return isP;
    }
}
