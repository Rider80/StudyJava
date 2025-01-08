package com.study.module1.task16;

public class Calcweekendtern {
    public static String chekWeekend(String weekday){
        System.out.println(weekday.equals("Sunday")||(weekday.equals("Saturday"))?"Ура, выходной!":"Надо ещё поработать");
        return weekday;
    }
}
