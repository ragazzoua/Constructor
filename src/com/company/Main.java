package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Account bobsAccount = new Account();
        bobsAccount.setNumber("12345");
        bobsAccount.setBalance(0.00);
        bobsAccount.setCustomerName("Bob Brown");
        bobsAccount.setCustomerEmailAddress("mail@mail.com");
        bobsAccount.setCustomerPhoneNumber("(066) 7777117");




        bobsAccount.withdrawal(100.0);
        bobsAccount.deposit(100.0);
        bobsAccount.withdrawal(10.0);
    }
}
