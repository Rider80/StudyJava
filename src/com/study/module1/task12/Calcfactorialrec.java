package com.study.module1.task12;

import java.math.BigInteger;

public class Calcfactorialrec {
    public static BigInteger factorial(int n){
        BigInteger fact = BigInteger.valueOf(1); //инициализируем fact со значением 1
        if (n == 0 || n == 1) { //факториал 0 и 1 равен 1
            return fact;}
        else {
            fact = BigInteger.valueOf(n).multiply(factorial(n - 1)); //рекурсия, умножаем число на факториал предыдущего
        }
        return fact;
    }
}
