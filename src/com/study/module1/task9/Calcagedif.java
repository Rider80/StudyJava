package com.study.module1.task9;

public class Calcagedif {
    public static byte getAgeDiff(byte age1, byte age2) {
        if (age1 > age2) {
            return (byte) (age1 - age2);
        } else {
            return (byte) (age2 - age1);
        }
    }
}
