package com.example.calculatorLV2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Calculator {
   private final Collection<Integer> values = new ArrayList<>();

   public Collection<Integer> getValues() {
       return new ArrayList<>(values);
   }
   public void setValues(Collection<Integer> new_values) {
       this.values.clear();
       this.values.addAll(new_values);
   }
   public void removeResult() {
       Iterator<Integer> iter = this.values.iterator();
       if (iter.hasNext()) {
           iter.next();     // 첫 번째 요소로 이동
           iter.remove();   // 해당 요소 제거
       }
   }
   public int calculate(int first, int second, char operator) {
        int result = 0;
        switch (operator) {
            case '+':
                result = first + second;
                break;
            case  '-':
                result = first - second;
                break;
            case  '*':
                result = first * second;
                break;
            case   '/':

                try {
                    result = first / second;
                } catch (ArithmeticException e) {
                    System.out.println("0으로 나눌 수 없습니다!! 다시 입력해주세요.");
                    return -1;
                }
                break;

            default:
                break;
        }
        return result;
    }
}
