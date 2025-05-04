package com.example.calculatorLV2;
import java.util.Collection;
import java.util.Scanner;
import java.util.Set;

public class CalculatorLV2 {
    static final int MAX_STORE = 5;
    public static void main(String[] args) {
        final Set<Character> VALID_OPERATIONS = Set.of('+', '-', '*', '/');
        Calculator calculator = new Calculator(); // 객체 생성
        Scanner sc = new Scanner(System.in);
        int first = 0;
        int second = 0;
        int result = 0;
        char operations = '+'; // Default : +

        System.out.println("---------------<<start>>---------------");
        while(true){
            System.out.print("첫 번째 숫자(0 이상의 숫자)를 입력해주세요: ");
            first = sc.nextInt();
            System.out.print("\n두 번째 숫자(0 이상의 숫자)를 입력해주세요: ");
            second = sc.nextInt();
            System.out.print("\n사칙 연산 기호를 입력해주세요(+, -, *, /): ");
            operations = sc.next().charAt(0);

            if(first<0 || second<0) {
                System.out.println("입력값은 0 이상의 정수이어야 합니다. 다시 입력해주세요!!");
                continue;
            }else if(!VALID_OPERATIONS.contains(operations)) {
                System.out.println("연산 기호는 +, -, *, / 중에 하나이어야 합니다. 다시 입력해주세요!!");
                continue;
            }

            result = calculator.calculate(first, second, operations);
            if(operations == '/' && result == -1) {continue;}
            System.out.println("\n결과 : " + result);
            //Getter, Setter 활용
            Collection<Integer> get_results = calculator.getValues();
            get_results.add(result);
            calculator.setValues(get_results);
            for(int n: get_results) {
                System.out.println(n + " ");
            }
            if(get_results.size() >MAX_STORE) { // 사용자 설정 이상의 개수가 저장되어 있으면 하나 삭제
                System.out.println(MAX_STORE + "개 이상의 값이 저장되어있습니다. 가장 오래된 결과를 삭제합니다...");
                calculator.removeResult();
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String answer = sc.next();
            if (answer.equalsIgnoreCase("exit")) {
                System.out.println("계산기를 이용해주셔서 감사합니다...");
                break;
            }
            System.out.println("---------------<<continue>>---------------");
        }

    }
}
