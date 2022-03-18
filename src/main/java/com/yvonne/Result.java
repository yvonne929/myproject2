package com.yvonne;

public class Result {
    public static void main(String[] args) {
    Customer c1 = new Customer("0001",1200);
    SilverCustomer c2 = new SilverCustomer("0002",2000);
    GoldenCustomer c3 = new GoldenCustomer("0003",5000);

    c1.print();
    c2.print();
    c3.print();
    }
}
