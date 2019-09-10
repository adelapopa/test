package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
	// write your code here
        shoulWakeUp(true, 5);
        shoulWakeUp(false, 13);
        shoulWakeUp(true , 1);
    }
    public static void shoulWakeUp(boolean barking, int hourOfDay) {
        if((barking == true) && (hourOfDay < 8) || (hourOfDay > 23)){
            System.out.println("wake up");
        } else {
            System.out.println("invalid hour");
        }
    }
}
