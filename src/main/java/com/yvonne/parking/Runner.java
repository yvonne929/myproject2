package com.yvonne.parking;

import java.util.Date;

public class Runner {
    public static void main(String[] args) {
        //String id =
        Date d1 = new Date();
        System.out.println(d1);//印出現在時間格式
        System.out.println(d1.getTime());//印出毫秒(從以前到現在的毫秒數)
        long ms = 3*60*60*100; //一分鐘 = 100毫秒
        Date d2 = new Date();
        System.out.println(d2);
        System.out.println(d2.getTime());
    }
}
