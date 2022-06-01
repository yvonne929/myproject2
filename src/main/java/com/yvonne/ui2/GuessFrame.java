package com.yvonne.ui2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GuessFrame extends JFrame {
    JButton button = new JButton("guess");
    JLabel label = new JLabel("guess number 1-100");
    JLabel label2 = new JLabel(" ");
    JTextField textField = new JTextField(5);
    int secret = new Random().nextInt(100)+1;
    boolean win = false;
    int MAX = 100;
    int min = 1;
    int count = 0;

    public GuessFrame(){
    super();
    setSize(600,400);
    setLocation(300,200);
    setDefaultCloseOperation(DISPOSE_ON_CLOSE);

    System.out.println("secret:"+secret);

    setLayout(new FlowLayout());
    add(label);
    add(textField);
    add(button);
    add(label2);
    button.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        int number = Integer.parseInt(textField.getText());
        if (number > secret) {
            MAX = number;
        } else if (number < secret) {
            min = number;
        } else if (number == secret) {
            win = true;
            label2.setText("you win");
        }
        if (count >= 5) {
            label2.setText("you loose");
        }
        if (count < 5 && win == false) {
            label2.setText(min + " to " + MAX);
        }

        count++;
    }
});
    setVisible(true);
}



    public static void main(String[] args) {
    GuessFrame guessFrame = new GuessFrame();
    }
}
