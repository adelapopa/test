package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        System.out.println("the sum of the digits in number 125 is: " + sumDigits(125));
    }
    public static int sumDigits(int number){
      if(number < 10) {
          return  -1;
      }

      int sum = 0;
      while (number > 0 ) {
          // extract the lest-significant digit
          int digit = number % 10;
          sum += digit;

          //drop least-significand digit
          number /= 10;
      }
      return sum;
    }

}
