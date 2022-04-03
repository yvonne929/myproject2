package com.yvonne.sales0318;

public class Platinum extends DiscountCustomer{
    float off2 = 0.2f;
    public Platinum(String number, int prices) {
        super(number, prices);
        off = 0.3f;
    }

    public float bonus(){
        return prices*off2;
    }
    @Override
    public void print(){
        System.out.println(number + "\t" + prices + "\t" + (prices-backMoney())+"\t"+(prices-bonus()));
    }
}