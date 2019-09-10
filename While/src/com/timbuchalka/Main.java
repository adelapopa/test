package com.timbuchalka;

public class Main {

    public static void main(String[] args) {

        //WHILE
	int count = 1;
	while( count != 6) {
        System.out.println("count value is " + count);
        count++;
    }
        //FOR
	count = 1;
	for(int i=1; i != 6; i++){
        System.out.println("count value is:" + count);
        count++;
    }

	    //DO WHILE
        count = 6;
        do{
            System.out.println("Count value was: " + count);
            count++;

            if(count > 100) {
                break;
            }
        } while(count != 6);


        //testing the method isEvenNumber
        int number = 4;
        int finishNumber = 20;

        while(number <= finishNumber){
            number++;
            if(!isEvenNumber(number)){
                continue;
            }
            System.out.println("Even number " + number);
        }

    }
    public static boolean isEvenNumber(int parameter) {
        if((parameter % 2) == 0) {
            return true;
        } else{
            return false;
        }
    }
}
