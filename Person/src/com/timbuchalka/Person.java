package com.timbuchalka;

public class Person {
    private String firstName;
    private String secondName;
    private int age;

    public String getFirstName(){
        return this.firstName;
    }

    public String getSecondName(){
        return this.secondName;
    }

    public int getAge() {
        return this.age;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setSecondName(String secondName){
        this.secondName = secondName;
    }

    public void setAge(int age){
        if((age < 0) && (age > 100)){
            this.age=0;
        } else {
            this.age = age;
        }
    }

    public boolean isTeen(){
        if((age>12) && (age<20)){
            return true;
        } else{
            return false;
        }
    }

    public String getFullName(){
        if((this.firstName.isEmpty()) && (this.secondName.isEmpty())){
            return "";
        } else if(firstName.isEmpty()){
            return this.secondName;
        }else if(secondName.isEmpty()){
            return this.firstName;
        } else {
            return this.firstName + "  " + this.secondName;
        }
    }

}
