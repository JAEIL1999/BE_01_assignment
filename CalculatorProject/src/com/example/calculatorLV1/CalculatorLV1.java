package com.example.calculatorLV1;
import java.util.Scanner;
import java.util.Set;

public class CalculatorLV1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final Set<Character> VALID_OPERATIONS = Set.of('+', '-', '*', '/');
        int result = 0;
        int first_int = 0;
        int second_int = 0;

        while (true) {
            System.out.print("첫 번째 숫자(0 이상의 숫자)를 입력해주세요: ");
            first_int = sc.nextInt();
            System.out.print("\n두 번째 숫자(0 이상의 숫자)를 입력해주세요: ");
            second_int = sc.nextInt();
            System.out.print("\n사칙 연산 기호를 입력해주세요(+, -, *, /): ");
            char operations = sc.next().charAt(0);

            if(first_int<0 || second_int<0) {
                System.out.println("입력값은 0 이상의 정수이어야 합니다. 다시 입력해주세요!!");
                continue;
            }else if(!VALID_OPERATIONS.contains(operations)) {
                System.out.println("연산 기호는 +, -, *, / 중에 하나이어야 합니다. 다시 입력해주세요!!");
                continue;
            }

            switch (operations) {
                case '+':
                    result = first_int + second_int;
                    break;
                case  '-':
                    result = first_int - second_int;
                    break;
                case  '*':
                    result = first_int * second_int;
                    break;
                case   '/':
                    try {
                        result = first_int / second_int;
                    } catch (ArithmeticException e) {
                        System.out.println("0으로 나눌 수 없습니다!! 다시 입력해주세요.");
                        continue;
                    }
                    break;
                default:
                    break;
            }
            System.out.println("\n결과 : " + result);

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String answer = sc.next();
            if (answer.equalsIgnoreCase("exit")) {
                System.out.println("계산기를 이용해주셔서 감사합니다...");
                break;}
        }

    }
}
