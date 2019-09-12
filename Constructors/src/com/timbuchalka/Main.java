package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
	Account bobsAccount = new Account();//("12345" , 0.00 , "bob brown" , "myemail@yahoo.com", "0771494167") ;

        System.out.println(bobsAccount.getNumber());
        System.out.println(bobsAccount.getBalance());
        System.out.println(bobsAccount.getCustomerName());
        System.out.println(bobsAccount.getCustomerEmail());
        System.out.println(bobsAccount.getCustomerPhoneNumber());
    bobsAccount.withdrawal(100.0);

    bobsAccount.deposit(50.0);
    bobsAccount.withdrawal(100.0);

    bobsAccount.deposit(51.0);
    bobsAccount.withdrawal(100.0);
    }
}
