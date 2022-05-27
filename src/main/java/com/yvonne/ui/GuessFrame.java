package com.yvonne.ui;

import javax.swing.*;

public class GuessFrame extends JFrame {
    public GuessFrame(){
        super();
        setSize(600,400);
        setLocation(300,200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);

    }





    public static void main(String[] args) {
        GuessFrame guessFrame = new GuessFrame();
        //guessFrame.setSize(600,400);
        //guessFrame.setLocation(300,200)
    }
}
