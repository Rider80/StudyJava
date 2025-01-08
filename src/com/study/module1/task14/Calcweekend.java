package com.study.module1.task14;

public class Calcweekend {
    public static boolean isWeekend(String weekDay){
        switch (weekDay){
            case "Monday":
                return false;
            case "Tuesday":
                return false;
            case "Wednesday":
                return false;
            case "Thursday":
                return false;
            case "Friday":
                return false;
            case "Saturday":
                return true;
            case "Sunday":
                return true;
            default:
                return false;
        }
    }
}
