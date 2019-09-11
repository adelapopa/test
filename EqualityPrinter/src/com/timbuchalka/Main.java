package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
	// write your code here
        printEqual(-1, 2, 3);
        printEqual(1,1,1);
        printEqual(1,2,3);
        printEqual(11, 9 , 5);
    }
    public static void printEqual(int num1, int num2, int num3) {
       if((num1 < 0) || (num2 < 0) || (num3 < 0)){
           System.out.println("invalid value");
       } else if((num1 == num2) && (num2 == num3) && (num1==num3)){
           System.out.println("all number are equal");
       }else if((num1 != num2) && (num2 != num3) && (num1 != num3)){
           System.out.println("all numbers are different");
       }else {
           System.out.println("Neither all are equal or different");
       }
    }
}
