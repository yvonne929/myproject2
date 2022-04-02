package com.yvonne.sales0318;

public class DiscountCustomer extends Customer{
    public DiscountCustomer(String number, int prices){
    super(number,prices);
    off = 0.9f;
    }
    @Override
    public float backMoney(){
        return prices*off;
    }
}
