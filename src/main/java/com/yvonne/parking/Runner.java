package com.yvonne.parking;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Runner {
    public static void main(String[] args) {
        String enterTime = "08:00";
        String exitTime = "11:00";
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");//設定格式
        try {
        Date d1 = sdf.parse(enterTime);//把字串轉為物件
        System.out.println(d1);//印出現在時間格式
        System.out.println(d1.getTime());//印出毫秒(從以前到現在的毫秒數)
        }
        catch (Exception e){
            System.out.println("enter wrong format");
        }

        //long ms = 3*60*60*1000; //3小時換算成毫秒(一分鐘 = 1000毫秒)

        try {
            Date d2 = sdf.parse(exitTime);
            System.out.println(d2);
            System.out.println(d2.getTime());
        }
        catch (Exception e) {
            System.out.println("exit wrong format");
        }
    }
}
