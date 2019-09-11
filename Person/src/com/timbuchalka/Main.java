package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
	Person person = new Person();
	person.setFirstName("Adela");
	person.setSecondName("Maria");
	person.setAge(21);
        System.out.println("first name: " + person.getFirstName());
        System.out.println("last name: " +person.getSecondName());
        System.out.println("age = " + person.getAge());
        System.out.println("teen= " + person.isTeen());
        System.out.println("full name = " + person.getFullName());

    }
}
