package com.company;

/**
 * created by s.a.miroshnychenko 8/31/2018
 */

public class VipCustomer {

    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer(){
        this("Default name", 5000.00, "vip@mail.com");
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "vip2@mail.com");
    }

    public VipCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
