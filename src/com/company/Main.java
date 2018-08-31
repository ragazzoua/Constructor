package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        /*Account bobsAccount = new Account();//("12345", 0.00, "Bob Brown", "mail@mail.com", "(066) 7777117");



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
        System.out.println(timsAccount.getNumber());*/


        VipCustomer vipCustomer = new VipCustomer();
        VipCustomer vipCustomer1 = new VipCustomer("Bob", 2323.11);
        VipCustomer vipCustomer2 = new VipCustomer("Tim", 000.11, "eewww@email.com");

        System.out.println(vipCustomer.getName());
        System.out.println(vipCustomer1.getName() + vipCustomer1.getCreditLimit() + vipCustomer1.getEmailAddress());
        System.out.println(vipCustomer2.getName());

    }
}
