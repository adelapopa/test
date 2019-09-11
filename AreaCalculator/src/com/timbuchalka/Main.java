package com.timbuchalka;

public class Main {

    public static void main(String[] args) {

        System.out.println( area(-3));
        System.out.println(area(3.4));
        System.out.println(area(3,4));
        System.out.println(area(-3.2, 4.55));
        System.out.println(area(-1.2, -1.4));
    }
// AREA OF CIRCLE
    public static double area(double radius){
        if(radius < 0 ){
            return -1;
        } else {
            double areaOfCircle = radius * radius * Math.PI;
            return areaOfCircle;
        }
    }

    //AREA OF RECTANGLE
    public static double area(double x, double y){
        if ((x < 0) || (y < 0)) {
            return -1;
        } else {
            double areaOfRectangle = x * y;
            return areaOfRectangle;
        }
    }
}
