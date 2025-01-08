package com.study.module1.task13;

public class Calcgroup {
    public int determineGroup(int age){ //метод нестатический, как по условию
    if (age >=7 && age <= 13){
            return 1;
        } else if (age >=14 && age <=17){
            return 2;
        } else if (age >=18 && age <=65){
            return 3;
        } else {
        return -1;
        }
    }
}
