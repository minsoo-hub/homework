package calculator;

import java.util.Scanner;
import java.util.ArrayList;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Double> results = new ArrayList<>();

        while (true) {
            //1번쨰 숫자 입력 받기
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();
            System.out.println("첫번째 숫자 : " + num1);

            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();
            System.out.println("두번째 숫자 : " + num2);

            System.out.print("사칙연산 기호를 입력해주세요: ");
            char op = sc.next().charAt(0);
            System.out.println("입력한 사칙연산 기호 :" + op);

            
            double result =0;
            switch (op){
                case '+' :
                    result = num1 + num2;
                    break;
                case '-' :
                    result = num1 - num2;
                    break;
                case '*' :
                    result = num1 * num2;
                    break;
                case '/' :
                    if (num2 == 0){
                        System.out.println("나눗셈 연산에서 분모에 0이 입력이 불가능입니다.");
                        continue;
                    } else {
                        result = (double)num1 / num2;
                    }
                    break;
                default:
                    System.out.println("다시 입력해주세요");
                    continue;
            }
            // num1과 num2를 op으로 계산한 결과 값 출력
            System.out.println("결과 :" + result);

            results.add(result);

            System.out.print("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제): ");
            String input1 = sc.next();
            if (input1.equals("remove")) {
                if (!results.isEmpty()) {
                    double removedResult = results.remove(0); // 가장 먼저 저장된 결과 삭제
                    System.out.println("삭제된 결과: " + removedResult);
                } else {
                    System.out.println("삭제할 결과가 없습니다.");
                }
            }
            System.out.print(":저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회) :");
            String input2 = sc.next();
            if (input2.equals("inquiry")) {
                if (!results.isEmpty()){
                    for (int i = 0; i < results.size(); i++){
                        System.out.println("입력값 :" + results.get(i));
                    }
                }else {
                    System.out.println("저장된 값이 없습니다.");
                }
            }

            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료) : ");
            String str = sc.next();
            if (str.equals("exit")){
                System.out.println("종료");
                break;
            }
        }
    }
}
