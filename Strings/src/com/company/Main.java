package com.company;

public class Main {

    public static void main(String[] args) {
	    //byte(-127, + 128)
        //short
        //int
        //long
        //float
        //double
        //char
        //boolean
        String myString = "this is a string";
        System.out.println("myString is equal to : " + myString);

        myString = myString + ", an this is more. ";
        System.out.println("myString is equal to : " + myString);

        myString = myString + "\u00A9 2019";
        System.out.println("myString is equal to : " + myString);


        String numberString = "250.55";
        numberString = numberString + "49.95";//add string "49.95" to "250.55" => 250.5549.95
        System.out.println(numberString);


        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("Last string is equal to " + lastString);

        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println("Last string is equal to " + lastString);

    }
}
