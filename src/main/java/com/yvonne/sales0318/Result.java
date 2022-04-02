package com.yvonne.sales0318;

import java.util.ArrayList;
import java.util.List;

public class Result {
    public static void main(String[] args) {
       List<Customer> Cus = new ArrayList<>();
    /*Customer c1 = new Customer("0001",1200);
    SilverCustomer c2 = new SilverCustomer("0002",2000);
    GoldenCustomer c3 = new GoldenCustomer("0003",5000);
    DiscountCustomer c4 = new DiscountCustomer("0004",9000);
    Platinum c5 = new Platinum("0005",1000);*/
        Cus.add(new Customer("0001",1200));
        Cus.add(new SilverCustomer("0002",2000));
        Cus.add(new GoldenCustomer("0003",5000));
        Cus.add(new DiscountCustomer("0004",9000));
        Cus.add(new Platinum("0005",1000));
        for (int i = 0; i < 5; i++) {
            Cus.get(i).print();
        }
        for(Customer c : Cus) {
            c.print();
        }
    }
}
