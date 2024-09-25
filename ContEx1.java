package javaBasic;

import javax.swing.*;
import javax.swing.text.StyledEditorKit;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ContEx1 {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Popular Song Voting");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JLabel label = new JLabel("Select your favorite song:");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setFont(new Font("Gulim", Font.BOLD, 18));
        frame.add(label);

        JButton btn1 = new JButton("아이유 - LILAC");
        btn1.setSize(400, 50);
        frame.add(btn1);

        JButton btn2 = new JButton("프로미스나인 - We Go");
        frame.add(btn2);
        btn2.setSize(400, 50);




        frame.setVisible(true);

    }


}
