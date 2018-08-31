package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Account bobsAccount = new Account();//("12345", 0.00, "Bob Brown", "mail@mail.com", "(066) 7777117");



        System.out.println(bobsAccount.getNumber());
        System.out.println(bobsAccount.getBalance());
        //System.out.println(bobsAccount.getCustomerName());
        //System.out.println(bobsAccount.getCustomerEmailAddress());
        //System.out.println(bobsAccount.getCustomerPhoneNumber());
        bobsAccount.withdrawal(100.0);
        bobsAccount.deposit(100.0);
        bobsAccount.withdrawal(10.0);

        Account timsAccount = new Account("Tim", "email@emailTim.com", "232323");
        System.out.println(timsAccount.getBalance());
        System.out.println(timsAccount.getNumber());


    }
}
