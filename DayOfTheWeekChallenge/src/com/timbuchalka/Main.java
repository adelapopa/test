package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
	printDayOfTheWeek(5);
	printDayOfTheWeek(-3);
	printDayOfTheWeek(3);
    }
    private static void printDayOfTheWeek(int day){
        if(day == 0) {
            System.out.println("(if)Sunday");
        } else if(day == 1) {
            System.out.println("(if)Monday");
        } else if( day == 2) {
            System.out.println("(if)tuesday");
        } else if(day == 3) {
            System.out.println("(if)wednesday");
        } else if(day == 4) {
            System.out.println("(if)thursday");
        } else if( day == 5) {
            System.out.println("(if)friday");
        } else if(day == 6) {
            System.out.println("(if)saturday");
        } else {
            System.out.println("(if)invalid day");
        }

        switch (day) {
            case 0:
                System.out.println("(switch)Sunday");
                break;
            case 1:
                System.out.println("(switch)Monday");
                break;
            case 2:
                System.out.println("(switch)Tuesday");
                break;
            case 3:
                System.out.println("(switch)Wednesday");
                break;
            case 4:
                System.out.println("(switch)Thursday");
                break;
            case 5:
                System.out.println("(switch)Friday");
                break;
            case 6:
                System.out.println("(switch)Saturday");
                break;
            default:
                System.out.println("(switch)invalid day");
                break;
        }
    }
}
