package com.study.module1.task8;

public class Expr {
    public static char charExpression(int a){
        char ch = '\\';
        char result = (char) (ch + a);
        System.out.println("Ваша буква:\n"+result);
        return result;
    }
}
