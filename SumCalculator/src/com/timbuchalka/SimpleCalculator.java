package com.timbuchalka;

public class SimpleCalculator {
    private double firstNumber, secondNumber;

    public double getFirstNumber(){
        return this.firstNumber;
    }

    public double getSecondNumber(){
        return this.secondNumber;
    }

    public void setFirstNumber(double firstNumber){
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber){
        this.secondNumber = secondNumber;
    }

    public double getAdditionResult(){
        return this.firstNumber+this.secondNumber;
    }

    public double getSubstractionResult() {
        return this.firstNumber-this.secondNumber;
    }

    public double getMultiplicationResult(){
        return this.firstNumber*this.secondNumber;
    }

    public double getDivisionResult(){
        if(secondNumber == 0) {
            return 0;
        } else {
            return this.firstNumber/this.secondNumber;
        }
    }
}
