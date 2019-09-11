package com.timbuchalka;

public class Main {

    public static void main(String[] args) {

        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(75, 58));
        System.out.println(getDurationString(187));
    }

    public static String getDurationString(long minutes , long seconds){
        if((minutes >= 0) && (seconds >= 0) && (seconds <= 59)){
            long hours = minutes / 60;
            long remainingMinutes = minutes % 60;
            return hours + "h " + remainingMinutes + "m " +seconds + "s ";
        } else{
            return "invalid value";
        }
    }
    public static String getDurationString(long seconds) {
        if(seconds>=0){
            long minutes = seconds / 60;
            long remainingSeconds = seconds % 60;
            return minutes + " minutes, " + remainingSeconds +  "miliseconds";
        } else {
            return "invalid value";
        }
    }

}
