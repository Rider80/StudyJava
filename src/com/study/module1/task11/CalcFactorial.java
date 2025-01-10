package com.study.module1.task11;

import java.math.BigInteger;

public class CalcFactorial {
    public static BigInteger factorial(int n) {
        BigInteger fact = BigInteger.valueOf(1); //инициализируем fact со значением 1
        if (n == 0 || n == 1) { //факториал 0 и 1 равен 1
            return fact;
        } else {
            for (int i = 1; i <= n; i++) {
                fact = fact.multiply(BigInteger.valueOf(i)); // вычисляем факториал
            }
            return fact;
        }
    }
}
