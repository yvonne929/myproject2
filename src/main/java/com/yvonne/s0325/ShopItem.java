package com.yvonne.s0325;

public class ShopItem {
    String ID;
    String name;
    int price;

    public ShopItem(String ID , String name, int price){
        this.ID = ID;
        this.name = name;
        this.price = price;
    }

    public void print(){
        int QTY = 1;
        int pay = price*QTY;
        System.out.println(ID+"\t"+name+"\t"+price+"\t"+QTY+"\t"+pay);
    }
}
