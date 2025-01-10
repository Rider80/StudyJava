package com.study.module1.task29;

public class ParseAndSqrt {
    public static long parseAndSqrt(String number) {
        return Math.round(Math.sqrt(Long.parseLong(number)));
    }
}
