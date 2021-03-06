package com.yvonne.parking;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Runner {
    public static void main(String[] args) {
        String enterTime = "08:a0";
        String exitTime = "11:14";
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");//設定格式
        Date d1 = null;
        try {
        d1 = sdf.parse(enterTime);//把字串轉為物件
        System.out.println(d1);//印出現在時間格式
        System.out.println(d1.getTime());//印出毫秒(從以前到現在的毫秒數)
        }
        catch (Exception e){
            System.out.println("enter wrong format");
        }

        //long ms = 3*60*60*1000; //3小時換算成毫秒(一秒 = 1000毫秒)

        try {
            Date d2 = sdf.parse(exitTime);
            System.out.println(d2);
            System.out.println(d2.getTime());
            int mins = (int)((d2.getTime()-d1.getTime()))/1000/60;//毫秒差值轉為分鐘
            System.out.println(mins);
            int fee = 30*(mins/60);//一小時收30元

            //3hr14min -> $90 , 3hr15min -> $120
            if (mins%60 <= 14){
                fee = 30*(mins/60);
            }
            else {
                fee = 30*((mins/60)+1);
            }
            System.out.println("fee:"+fee);

            /*
            3hr15min -> $105
            if (mins%60 <= 14){
                fee = 30*(mins/60);
            }
            else{
                fee = 30*(mins/60)+15;
            }
            System.out.println("fee:"+fee);
            */
        }
        catch (Exception e) {
            System.out.println("exit wrong format");
        }
    }
}
