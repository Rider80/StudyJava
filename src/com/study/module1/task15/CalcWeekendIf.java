package com.study.module1.task15;

public class CalcWeekendIf {
    public static boolean isWeekend(String weekDay) {
        if (weekDay.equals("Sunday") || (weekDay.equals("Saturday"))) {
            return true;
        } else {
            return false;
        }
    }
}
