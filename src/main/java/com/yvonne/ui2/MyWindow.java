package com.yvonne.ui2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500,500);
        frame.setLocation(500,100);
        frame.setDefaultCloseOperation(frame.DISPOSE_ON_CLOSE);

        JButton button = new JButton("Hello World");
        frame.add(button);
        frame.setLayout(new FlowLayout());

        /*有名類別
        MyActionListener listener = new MyActionListener();
        button.addActionListener(listener);
        */

        //匿名類別
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("Hi");
            }
        });

        frame.setVisible(true);
    }
}
