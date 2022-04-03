package com.yvonne.sales0318;

public class SilverCustomer extends Customer {

    public SilverCustomer(String number,int prices){
        super(number,prices);
    }

    @Override
    public void print(){
        System.out.println(number + "\t" + prices + "\t" + (prices-backMoney())+ "\t" +backMoney());
    }
}

