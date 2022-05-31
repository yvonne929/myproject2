package com.yvonne.ui2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GuessFrame extends JFrame {
    JButton button = new JButton("guess");
    JLabel label = new JLabel(" ");
    JTextField textField = new JTextField(5);
    int secret = new Random().nextInt(100)+1;

    public GuessFrame(){
    super();
    setSize(600,400);
    setLocation(300,200);
    setDefaultCloseOperation(DISPOSE_ON_CLOSE);

    System.out.println("secret:"+secret);

    setLayout(new FlowLayout());
    add(textField);
    add(button);
    add(label);
    button.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        for (int i = 1; i < 5; i++) {
        int number = Integer.parseInt(textField.getText());
        int MAX = 100;
        int min = 1;
        if (number > secret){
            MAX = number;
            label.setText(min+"~"+MAX);
        }
        else if (number < secret){
            min = number;
            label.setText(min+"~"+MAX);
        }
        else if (number == secret){
            label.setText("Bingo!");
            break;
        }
        }
    }
});
    setVisible(true);
}



    public static void main(String[] args) {
    GuessFrame guessFrame = new GuessFrame();
    }
}
