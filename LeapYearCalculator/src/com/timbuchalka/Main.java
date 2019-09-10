package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        isLeapYear(1600);
        isLeapYear(2500);
        isLeapYear(2000);
        isLeapYear(1900);
    }
    public static void isLeapYear(int year) {
        if((year >= 1) && (year < 9999)){
             if(year % 4 == 0) {
                 if(year % 100 == 0) {
                     if(year % 400 == 0) {
                         System.out.println("the year "+ year + " is leap");
                     }
                 }
             }
        } else {
            System.out.println("this year is not leap" + year);
        }
    }
}
