package javaBasic;

import java.util.Scanner;

public class VarEx2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("여행 지역을 입력하세요: ");
        String region = input.nextLine();

        System.out.print("1인당 경비를 입력하세요: ");
        double cost = input.nextDouble();

        System.out.print("여행 인원을 입력하세요: ");
        int person = input.nextInt();

        System.out.print("할인율(%)을 입력하세요: ");
        double discountRate = input.nextDouble();

        System.out.print("VIP 여부(true/false)를 입력하세요: ");
        boolean vip = input.nextBoolean();
        input.nextLine();

        System.out.print("당부의 말을 입력하세요: ");
        String saying = input.nextLine();

        double totalCost = cost * person;

        System.out.println("==== 여행 경비 계산 결과 ====");
        System.out.println("여행 지역: " + region);
        System.out.println("1인당 경비: " + cost);
        System.out.println("여행 인원: " + person);
        System.out.println("기본 할인율: " + discountRate);
        if (vip == true) {
            System.out.println("VIP 추가 할인율: 5%");
            System.out.println("최종 할인율: " + (discountRate + 5));
        } else {
            System.out.println("최종 할인율: " + discountRate);
        }
        System.out.println("총 경비: " +totalCost);

        if (vip == true) {
            double discountCostVip = totalCost * (discountRate+5)/100;
            System.out.println("할인 금액: " + discountCostVip);
            System.out.println("할인 후 총 경비: " + (totalCost - discountCostVip));
        } else {
            double discountCostNot = totalCost * discountRate/100;
            System.out.println("할인 금액: " + discountCostNot);
            System.out.println("할인 후 총 경비: " + (totalCost - discountCostNot));
        }
        System.out.println("당부의 말: " + saying);

    }
}
