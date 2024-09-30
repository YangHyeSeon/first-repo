package javaBasic;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int students=0;
        int sizeForArraySrc=0;

        while (true) {
            int [] scores = new int[sizeForArraySrc];
            System.out.println("----------------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
            System.out.println("----------------------------------------------------");
            System.out.print("선택> ");
            int choice = input.nextInt();

            if (choice == 1)
            {
                System.out.print("학생수> ");
                students = input.nextInt();
                sizeForArraySrc=students;
                int [] scores = new int[sizeForArraySrc];
            } else if (choice == 2)
            {
                //for (int i = 0; i < students; i++)
                for (int i = 0; i < sizeForArraySrc; i++)
                {
                    System.out.print("scores" + "[" + i + "]>");
                    //scores[i] = input.nextInt();
                    scores[i] = Integer.parseInt((scanner.nextLine()));
                    System.out.println(Arrays.toString(scores));
                }
            } else if (choice == 3)
            {

                for (int j = 0; j < scores.length; j++)
                {
                    System.out.println("scores" + "[" + j + "]>" + scores[j]);
                    System.out.println(Arrays.toString(scores));
                }
            } else if (choice == 4)
            {
                int max = scores[0];
                for (int x = 0; x < scores.length; x++) {
                    if (max < scores[x]) {
                        max = scores[x];
                    }
                }
                System.out.println("최고 점수: " + max);

                int sum = 0;
                for (int y : scores) {
                    sum += y;
                }
                double average = sum / scores.length;
                System.out.println("평균 점수: " + average);

            } else if (choice == 5) {
                System.out.println("프로그램 종료");
                break;
            }
        }




    }
}
