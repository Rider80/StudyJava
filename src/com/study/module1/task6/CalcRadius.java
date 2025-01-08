package com.study.module1.task6;

public class CalcRadius {
    public static double calcCircleRadius(double area){
    double radius = Math.sqrt(area / Math.PI);
    System.out.printf("Радиус окружности равен:\n%.3f", radius);
    return radius;
    }
}
