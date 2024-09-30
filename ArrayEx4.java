package deepPractice;

import java.util.Scanner;

public class ArrayEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] seats = new int[10];
        int totalSeats = 0;

       for (int i = 0; i < seats.length; i++) {
           System.out.println("현재 좌석 상태: ");
           System.out.println("1:" + seats[0] + "\t2:" + seats[1] + "\t3:" + seats[2] + "\t4:" + seats[3] + "\t5:" + seats[4] + "\t6:" + seats[5] + "\t7:" + seats[6] + "\t8:" + seats[7] + "\t9:" + seats[8] + "\t10:" + seats[9]);
           System.out.print("예매할 좌석 번호를 입력하세요 (종료하려면 0 입력): ");
           int choice = scanner.nextInt();

           if (choice == i + 1) {
               System.out.println((i+1) + "번 좌석이 예매되었습니다.");
               totalSeats++;

           } else if (choice == 0) {
               System.out.println("예매된 좌석 수: " + totalSeats );
               System.out.println("총 예매 금액: " + (totalSeats * 10000));
               break;
           }
        }
    }
}
