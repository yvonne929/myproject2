package com.yvonne.s0325;

public class BuyOneGetOneShopItem extends ShopItem{

    public BuyOneGetOneShopItem(String ID, String name, int price){
    super(ID,name,price);
    }
    public void print(){
        int QTY = 2;
        int pay = price;
        System.out.println(ID+"\t"+name+"\t"+price+"\t"+QTY+"\t"+pay+"\t"+"Buy 1 get 1");
    }

}
