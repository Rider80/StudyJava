package com.study.module1.task1;

public class ITCompany {
    public static int drawisMonitorsCounter(int monitors, int programmers) {
        int monLeft = monitors % programmers; // остаток мониторов
        return monLeft; // возвращаем кол-во оставшихся мониторов
    }
}
