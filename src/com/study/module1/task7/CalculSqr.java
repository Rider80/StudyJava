package com.study.module1.task7;

import java.math.BigInteger;

public class CalculSqr {
    public static void maxLongSqr() {
    BigInteger maxLong = new BigInteger(String.valueOf(Long.MAX_VALUE)); //создаеём объект BigInteger с max значением long
    BigInteger maxLongSqr = maxLong.multiply(maxLong); //вычисляем квадрат максимальнгого значения
    System.out.println("Квадрат максимального значения типа long:");
    System.out.println(maxLongSqr); //результат на экран
    }
}
