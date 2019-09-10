package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        // IF
	int value = 28;
	if(value == 1 ) {
        System.out.println("value was 1");
    } else if(value == 2 ) {
        System.out.println("value was 2");
    } else {
        System.out.println("the value was not 1 or 2 ");
    }

	// SWITCH
        int switchValue = 4;
	switch (switchValue){
        case 1 :
            System.out.println("value was 1");
            break;
        case 2:
            System.out.println("value was 2");
            break;
        case 3: case 4: case 5:
            System.out.println("value was 3 , 4 or 5");
            System.out.println("actually it was a " + switchValue);
            break;
        default:
            System.out.println("the value was not 1 or 2");
            break;
    }
    // CHALLENGE
        char charVariable = 'D';
	switch (charVariable){
        case 'A':
            System.out.println("A was found");
            break;
        case'B':
            System.out.println("B was found");
            break;
        case 'C': case 'D': case 'E':
            System.out.println( charVariable + " was found");
            break;
        default:
            System.out.println("Could not found A, B, C, D or E");
            break;
    }
    // SWITCH STRING
        String month = "December";
	switch (month){
        case "January":
            System.out.println("January");
            break;
        case "February":
            System.out.println("February");
            break;
        default:
            System.out.println("Another month");
            break;

    }
    }
}
