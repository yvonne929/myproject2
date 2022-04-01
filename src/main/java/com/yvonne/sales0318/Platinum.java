package com.yvonne.sales0318;

public class Platinum extends SilverCustomer{
    float bonusOff;
    public Platinum(String number,int prices){
        super(number,prices);
        this.bonusOff = bonusOff;
        off = 0.7f;
        bonusOff = 0.8f;
    }

    @Override
    public void print() {
        float offMoney = prices*off;
        float bonus = prices*bonusOff;
        System.out.println(number + "\t" + prices + "\t" + offMoney+ "\t" +bonus);
    }
}
