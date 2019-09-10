package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasEqualSum(1,1,2));
        System.out.println(hasEqualSum(0,2,2));
        System.out.println(hasEqualSum(2,3,6));
    }
    public static boolean hasEqualSum(int num1, int num2, int num3){
        if((num1 + num2) == num3) {
            return true;
        } else {
            return false;
        }
    }
}
