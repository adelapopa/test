package com.company;

public class Main {

    public static void main(String[] args) {
	float myMinFloatValue = Float.MIN_VALUE;
	float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);


        int myIntValue = 5;
        float myFloatValue = (float ) 5.25;
        float myFloatValueTwo = 5.25f;
        double myDoubleValue = 5.25;
        System.out.println(myIntValue + ',' + myFloatValue + ',' + myFloatValueTwo + ',' + myDoubleValue);


        int myIntValueTwo = 5 / 3; //2
        float myFloatValueThree = 5f / 3; //2.5
        double myDoubleValueTwo = 5.00 / 3.00; //2.5
        System.out.println("myIntValueTwo " + myIntValueTwo);
        System.out.println("myFloatValueTwo " + myFloatValueThree);
        System.out.println("myDoubleValueTwo " + myDoubleValueTwo);



        //Challenge section 3, chapter 29
        double numberOfPounds = 319; //
        double convertedKilograms = numberOfPounds * 0.45359237;
        System.out.println("Converted kilograms = " + convertedKilograms);


        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;
        System.out.println(pi);
        System.out.println(anotherNumber);

    }
}
