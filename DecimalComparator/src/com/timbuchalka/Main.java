package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1034,-3.1035));
        System.out.println(areEqualByThreeDecimalPlaces(3.1234 , 3.1235));
        System.out.println(areEqualByThreeDecimalPlaces(-3.103,-3.1025));
    }
    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber){
        double convertFirstNumber = (firstNumber * 1000);
        double convertSecondNumber = (secondNumber * 1000);
        if((int)convertFirstNumber == (int)convertSecondNumber){
            return true;
        } else {
            return false;
        }
//        if ( (int) (firstNumber * 1000) == (int) (secondNumber * 1000) ){
//            return true;
//        }
//        else {
//            return false;
//        }
    }
}
