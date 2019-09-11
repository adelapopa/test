package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
	// write your code here
        printYearsAndDays(561600);
        printYearsAndDays(12345);
        printYearsAndDays(9999999);
    }
    public static void printYearsAndDays(long minutes) {
        if(minutes < 0) {
            System.out.println("invalid value");
        } else {
            long year = minutes /(24* 60 * 365);
            long day = (minutes % (24* 60 * 365)) / (24 * 60);
            System.out.println(minutes + "min= " + year + "year= " + day+  "day");

        }
    }

}
