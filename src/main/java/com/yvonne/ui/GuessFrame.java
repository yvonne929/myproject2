package com.yvonne.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GuessFrame extends JFrame {
    JButton button = new JButton("Guess");
    JLabel label = new JLabel(" ");
    JTextField number = new JTextField(5);//JTextField()裡是設定輸入格的大小
    Random random = new Random();
    int secret = random.nextInt(10)+1;

    public GuessFrame(){
        super();
        setSize(600,400);
        setLocation(300,200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        System.out.println(secret);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int num = Integer.parseInt(number.getText());
                //System.out.println(num);
                //System.out.println("Java");//顯示成文字(不在視窗內)
                //label.setText("Java");//會改變之前設定的label -> ("world")
                if(num > secret){
                    label.setText("Smaller");
                }
                else if(num < secret){
                    label.setText("Bigger");
                }
                else if(num == secret){
                    label.setText("Bingo");
                }
            }
        });

        setLayout(new FlowLayout());
        add(number);
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
