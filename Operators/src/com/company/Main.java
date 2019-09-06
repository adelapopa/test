package com.company;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2; // 3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previous result: " + previousResult);

        result = result - 1; // 2
        System.out.println("3-1 = " + result);
        System.out.println("previous result: " + previousResult);

        result = result * 10; // 2 * 10 = 20
        System.out.println("result(2) * 10 = " + result);

        //division
        result = result / 5; // 20 / 5 = 4
        System.out.println("result(20) / 5 = " + result);

        result = result % 3; // the remainder of (4 % 3 ) = 1
        System.out.println("4 % 3 = " + result);

        //result = result + 1
        result++; // 1 + 1 = 2
        System.out.println("1 + 1 = " + result);

        result--; //2-1=1
        System.out.println("2-1= " + result);

        //result = result+ 2
        result += 2; //1 +2 = 3
        System.out.println("1 + 2= " + result);

        //result = result * 10
        result *= 10; // 3* 10 = 30
        System.out.println("3 * 10 = " + result);

        //result = result / 3
        result /= 3; // 30 / 3 = 10
        System.out.println("30 / 3 = " + result);

        //result = result - 2;
        result -= 2; // 10 - 2 = 8
        System.out.println("10 - 2 = " + result);


        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");
        }
        int topScore = 80;
        if(topScore >= 100) {
            System.out.println("you got the high score!");
        }

        //AND OPERATOR
        int secoundTopScore = 95;
        if((topScore > secoundTopScore) && (topScore < 100)) {
            System.out.println("greater than second top score and less than 1000");
        }

        //OR OPERATOR
        if((topScore > 90) || (secoundTopScore <=90)) {
            System.out.println("either or both of the condition are true");
        }

        int newValue = 50;
        if(newValue == 50 ) {
            System.out.println("this is true");
        }

        boolean isCar = false;
        if(isCar) {
            System.out.println("this is not supposed to happen");
        }
        boolean wasCar = isCar ? true : false; // isCar = condition



        //CHALLENGE
        double firstDoubleVariable = 20.00d;
        double secondDoubleVariable = 80.00d;
        double totalDouble = (firstDoubleVariable + secondDoubleVariable) * 100.00d;
        System.out.println("totalDouble= " +totalDouble);
        double reminderValue = totalDouble % 40.00d;
        System.out.println("reminderValue = " + reminderValue);
        boolean assignValue = (reminderValue == 0) ? true : false;
        System.out.println("assignValue = " + assignValue);
        System.out.println(assignValue);
        if(!assignValue) {
            System.out.println("got some remainder");
        }

    }
}
