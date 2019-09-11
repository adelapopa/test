package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(isCatPlaying(true, 27));
        System.out.println(isCatPlaying(false, 0));
        System.out.println(isCatPlaying(true, 9));
        System.out.println(isCatPlaying(true, 34));
    }
    public static boolean isCatPlaying(boolean summer , int temperature) {
        if(summer && (temperature <= 45 && temperature>= 25 )){
            return true;
        }else if(temperature<=35 && temperature >= 25){
            return true;
        } else {
            return false;
        }
    }
}
