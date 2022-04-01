package com.yvonne.sales0318;

public class DiscountCustomer extends Customer{
    public DiscountCustomer(String number, int prices){
    super(number,prices);
    off = 0.9f;
    }
    @Override
    public void print(){
        float offMoney =prices*off ;
        System.out.println(number + "\t" + prices +"\t" + offMoney);
    }
}
