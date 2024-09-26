package deepPractice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ContEx2 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Number Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 200);
        frame.setLayout(new GridLayout (4,1));

        JLabel label = new JLabel("게임을 계속 하시겠습니까?");
        label.setHorizontalAlignment(JLabel.CENTER);
        Font font = new Font("돋음", Font.BOLD, 20);
        frame.add(label);

        JButton contin = new JButton("계속");
        contin.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        JButton exit = new JButton("종료");
        exit.setBorder(BorderFactory.createLineBorder(Color.RED));
        frame.add(contin);
        frame.add(exit);

        contin.addActionListener(new ActionListener() {
            int gameCount = 0;
            int countFirst = 0;
            int countSecond = 0;
            public void actionPerformed(ActionEvent e) {
                String firstInput = JOptionPane.showInputDialog("첫 번째 사람이 숫자를 입력하세요.");
                String secondInput = JOptionPane.showInputDialog("두 번째 사람이 숫자를 입력하세요.");

                int firstInput2 = Integer.parseInt(firstInput);
                int secondInput2 = Integer.parseInt(secondInput);

                if (firstInput2 > secondInput2) {
                    JOptionPane.showMessageDialog(null, "첫 번째 사람이 이겼습니다!");
                    countFirst++;
                } else {
                    JOptionPane.showMessageDialog(null, "두 번째 사람이 이겼습니다!");
                    countSecond++;
                }
                gameCount++;

                exit.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(null, "총 게임 수: " + gameCount + "\n첫 번째 사람이 이긴 수: " + countFirst + "\n두 번째 사람이 이긴 수: " + countSecond);

                    }
                });
            }

        });

        frame.setVisible(true);
    }
}
