package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Account bobsAccount = new Account();

        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(100.0);
        bobsAccount.withdrawal(10.0);
    }
}
