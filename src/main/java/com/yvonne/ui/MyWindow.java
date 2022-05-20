package com.yvonne.ui;

import javax.swing.*;

public class MyWindow {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(600,400);//設定介面大小
        frame.setLocation(300,200);//設定介面位置(原在左上角)
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//設定行為(關掉介面程式也會停止)
        JButton button = new JButton("OK");//add component(元件)
        frame.add(button);//在frame裡添加component

        frame.setVisible(true);
        //顯示介面
        //()裡是boolean值，true會顯示介面，false則不會

        System.out.println("END?");
    }
}
