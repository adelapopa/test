package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasTeen(3, 14,99));
        System.out.println(hasTeen(23,34,56));
        System.out.println(isTeen(14));
        System.out.println(isTeen(29));
    }
    public static boolean hasTeen(int num1, int num2, int num3) {
        if((num1 >= 13 && num1<= 19) || (num2 >= 13 && num2 <=19) || (num3 >=13 && num3 <=19)){
            return true;
        } else {
            return false;
        }
    }
    public static boolean isTeen(int number) {
        if((number>=13) && (number<=19)){
            return true;
        } else {
            return false;
        }
    }

}
