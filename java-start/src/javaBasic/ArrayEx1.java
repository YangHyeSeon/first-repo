package javaBasic;

import java.util.Arrays;
import java.util.Random;

public class ArrayEx1 {

        public static void main(String[] args) {
            int[] num = new int[20];
            Random r = new Random();
            for (int i = 0; i < 20; i++) {
                num[i] = r.nextInt(100);
            }
            for (int x : num) {
            }
            System.out.println("배열 프린트: " + Arrays.toString(num));

            Arrays.sort(num);
            System.out.println("오름차순 정렬 후 프린트: " + Arrays.toString(num));

            int max = num[0];
            for (int i = 1; i < num.length; i++) {
                if (max < num[i]) {
                    max = num[i];
                }
            }
            System.out.println("MAX: " + max);

            int min = num[0];
            for (int i = 1; i < num.length; i++) {
                if (min > num[i]) {
                    min = num[i];
                }
            }
            System.out.println("MIN: " + min);
        }
}
