package com.yvonne.parking;

import java.util.Date;

public class Runner {
    public static void main(String[] args) {
        //String id =
        Date d1 = new Date();
        System.out.println(d1);//印出現在時間格式
        System.out.println(d1.getTime());//印出毫秒(從以前到現在的毫秒數)
        long ms = 3*60*60*1000; //3小時換算成毫秒(一分鐘 = 1000毫秒)
        Date d2 = new Date();
        d2.setTime(d1.getTime()+ms);//設定d2的時間，d1時間加3小時
        System.out.println(d2);
        System.out.println(d2.getTime());
    }
}
