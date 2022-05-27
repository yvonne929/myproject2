package com.yvonne.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessFrame extends JFrame {
    public GuessFrame(){
        super();
        setSize(600,400);
        setLocation(300,200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        JButton button = new JButton("Hello");
        JLabel label = new JLabel("world!");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //System.out.println("Java");//顯示成文字(不在視窗內)
                label.setText("Java");//會改變之前設定的label -> ("world")
            }
        });
        setLayout(new FlowLayout());
        add(button);
        add(label);

        setVisible(true);

    }





    public static void main(String[] args) {
        GuessFrame guessFrame = new GuessFrame();
        //guessFrame.setSize(600,400);
        //guessFrame.setLocation(300,200)
    }
}
