package com.yvonne.s0325;

public class ShoppingTester {
    public static void main(String[] args) {
    ShopItem item1 = new ShopItem("0001", "T-shirt", 399);
    ShopItem item2 = new ShopItem("0002", "Hand bag", 799);
    BuyOneGetOneShopItem item3 = new BuyOneGetOneShopItem("0003", "Polo shirt", 499);
    SalesShopItem item4 = new SalesShopItem("0005", "Sport sox", 99, 20);
    SalesShopItem item5 = new SalesShopItem("0008", "Under wear", 129, 20);
    item1.print();
    item2.print();
    item3.print();
    item4.print();
    item5.print();
    }
    /*
    ID      NAME        PRICE   QTY PAY     MEMO
    0001    T-shirt     399     1   399
    0002    Hand bag    799     1   799
    0003    Polo shirt  499     2   499     Buy 1 get 1
    0005    Sport sox   99      1   79      20% off
    0008    Under wear  129     1   103     20% off
     */
}
