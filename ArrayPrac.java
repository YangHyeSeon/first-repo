package org.example.day4.array;

import java.util.Random;
import java.util.Scanner;

public class ArrayPrac {
    public static void main(String[] args) {
//        1.   int[] term1 = {77, 88, 99, 55, 70};
//             int[] term2 = {99, 100, 88, 80, 70};
//        // 1. 성적이 2학기에 향상된 학생의 수를 카운트해서 프린트
//        // 2. 성적이 1, 2학기 동일한 학생의 수를 카운트해서 프린트
        int[] term1 = {77, 88, 99, 55, 70};
        int[] term2 = {99, 100, 88, 80, 70};

        int count1 = 0; //2학기에 성적이 향상된 학생의 수
        int count2 = 0; //1,2학기 성적이 동일한 학생의 수
        for (int i = 0; i < term2.length; i++) {
            if (term1[i] < term2[i]) {
                count1++;
            }
            if (term2[i] == term1[i]) {
                count2++;
            }
        }
        System.out.println("2학기에 성적이 향상된 학생의 수 " + count1);
        System.out.println("1,2학기 성적이 동일한 학생의 수 " + count2);
        System.out.println("--------------------------------------");


//        2. 다음과 같이 값을 입력받아 출력되도록 프로그래밍하시오.
//        숫자 입력 : 55
//        숫자 입력 : 77
//        숫자 입력 : 11
//                ----------------
//        합계 143
//        평균 47.666666667
        Scanner sc = new Scanner(System.in);
        int [] scores = new int [3];
        for (int i = 0; i < scores.length; i++) {
            System.out.print("숫자 입력 : ");
            int input = sc.nextInt();
            scores[i] = input;
        }
        System.out.println("---------------");

        int sum = scores[0] + scores[1] + scores[2];
        double avg = (double) sum / 3.0;

        System.out.println("합계: " + sum);
        System.out.println("평균: " + avg);
        System.out.println("--------------------------------------");


//        3. int[] n = new int[1000];
//        random한 값 1~1000까지 배열에 넣어 전체 출력(씨앗값 : 44)
//        3-1. 첫번째값, 세번째값, 다섯번째값, 100번째값, 990번째 값을 더한 결과값 출력
//        3-2. 전체 합계와 평균 출력
        int[] n = new int[1000];
        Random rand = new Random(44);

        int total1 = 0; //첫번째값, 세번째값, 다섯번째값, 100번째값, 990번째 값을 더한 결과값
        int total2 = 0; //전체 합계
        for (int i = 0; i < n.length; i++) {
            n[i] = rand.nextInt(1000) + 1;
            total2 += n[i];
        }
        total1 = n[0] + n[2] + n[4] + n[99] + n[989];

        System.out.println("첫번째값, 세번째값, 다섯번째값, 100번째값, 990번째 값을 더한 결과값: " + total1);
        System.out.println("전체 합계: " + total2);
        System.out.println("평균: " + (total2/1000));
        System.out.println("--------------------------------------");



//        4. 다음과 같이 값을 입력받아 출력되도록 프로그래밍하시오.
//        (단, 다음에서 입력한 답이 1이면 열차, 2이면 배, 3이면 비행기를 타고 감.)
//        가고 싶은 곳 (보기, 1)백두산, 2)한라산, 3)후지산) 입력 >> 1
//        결과 출력은 당신이 가고 싶은 곳인 백두산은 열차를 타고 가야합니다.
        System.out.print("가고 싶은 곳 : 1)백두산, 2)한라산, 3)후지산) >> ");
        int location = sc.nextInt();

        String[] ride = {"열차" , "배", "비행기"};
        if (location == 1) {
            System.out.println("당신이 가고싶은 곳인 백두산은 " + ride[0] + "을 타고 가야합니다");
        }
        if (location == 2) {
            System.out.println("당신이 가고싶은 곳인 한라산은 " + ride[1] + "을 타고 가야합니다");
        }
        if (location == 3) {
            System.out.println("당신이 가고싶은 곳인 후지산은 " + ride[2] + "을 타고 가야합니다");
        }
        System.out.println("--------------------------------------");



//        5. random한 값 1부터 100까지 배열에 넣어 전체 출력(씨앗값 : 555), length는 1000
//        80이상인 개수, 70~79인 수 개수, 50~69인 수 개수, 49보다 작은 수 개수 카운트하여 출력
        int[] r = new int[1000];
        Random rand2 = new Random(555);
        for (int i = 0; i < r.length; i++) {
            r[i] = rand2.nextInt(100) + 1;
        }

        int countUp80 = 0;
        int countUp70 = 0;
        int countUp50 = 0;
        int countUnder49 = 0;
        for (int i = 0; i < r.length; i++) {
            if (r[i] >= 80) {
                countUp80++;
            }
            if (r[i] >= 70 && r[i] < 80) {
                countUp70++;
            }
            if (r[i] >= 50 && r[i] < 70) {
                countUp50++;
            }
            if (r[i] < 50) {
                countUnder49++;
            }
        }
        System.out.println("80이상인 개수: " + countUp80);
        System.out.println("70~79인 수 개수: " + countUp70);
        System.out.println("50~69인 수 개수: " + countUp50);
        System.out.println("49보다 작은 수 개수: " + countUnder49);
    }
}


