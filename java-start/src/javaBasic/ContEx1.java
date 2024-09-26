package javaBasic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ContEx1 {
    private static int countIu = 0;
    private static int countFro = 0;
    private static int countStac = 0;

    public static void main(String[] args) {

        JFrame frame = new JFrame("Popular Song Voting");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(new GridLayout (5,1));

        JLabel label = new JLabel("Select your favorite song:");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setFont(new Font("돋음", Font.BOLD, 14));
        frame.add(label);

        JButton btnIu = new JButton("아이유 - LILAC");
        btnIu.setBackground(Color.white);
        btnIu.setSize(400, 30);
        frame.add(btnIu);

        JButton btnFro = new JButton("프로미스나인 - We Go");
        btnFro.setBackground(Color.white);
        btnFro.setSize(400, 30);
        frame.add(btnFro);

        JButton btnStac = new JButton("스테이씨 - ASAP");
        btnStac.setBackground(Color.white);
        btnStac.setSize(400, 30);
        frame.add(btnStac);

        JButton btnExit = new JButton("종료");
        btnExit.setBackground(Color.white);
        btnExit.setSize(400, 30);
        frame.add(btnExit);

        btnIu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"You voted for 아이유 - LILAC");
                countIu++;
            }
        });

        btnFro.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"You voted for 프로미스나인 - We Go");
                countFro++;
            }
        });

        btnStac.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"You voted for 스테이씨 - ASAP");
                countStac++;
            }
        });

        btnExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"투표 결과:\n아이유 - LILAC:" + countIu + "표" + "\n프로미스나인 - We Go:" + countFro + "표" +"\n스테이씨 - ASAP:" + countStac + "표");
            }
        });
        
        frame.setVisible(true);

    }


}
