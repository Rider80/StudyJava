package com.study.module1.task3;

public class Expression {
    public static boolean doubleExpression(double a, double b, double c) {
        double pogreshnost = 0.0001;
        boolean isTrue = false;
        if (Math.abs(a + b - c) < pogreshnost) { //значение выражения меньше погрешности
            isTrue = true;
        }
        return isTrue;
    }
}
