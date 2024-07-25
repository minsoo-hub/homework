package calculator;

import java.util.Scanner;
import java.util.ArrayList
public class App {

    public static void main(String[] args) {
        //Level1_1
        Scanner sc = new Scanner(System.in);
        // ArrayList생성
        ArrayList<Double> results = new ArrayList<>();
        int count = 0;
        //Level1_4
        while (true) {
            //1번쨰 숫자 입력 받기
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();
            System.out.println("첫번째 숫자 : " + num1);

            //2번쨰 숫자 입력 받기
            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();
            System.out.println("두번째 숫자 : " + num2);

            //Level1_2
            System.out.print("사칙연산 기호를 입력해주세요: ");
            char op = sc.next().charAt(0);
            System.out.println("입력한 사칙연산 기호 :" + op);

            //Level1_3
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
            //선언한 배열에 연산결과값을 count변수로 인덱스정해주고 배열에 넣기

            results.add(result);

            System.out.print("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제): ");
            String str = sc.next();
            if (str.equals("remove")) {
                if (!results.isEmpty()) {
                    double removedResult = results.remove(0); // 가장 먼저 저장된 결과 삭제
                    System.out.println("삭제된 결과: " + removedResult);
                } else {
                    System.out.println("삭제할 결과가 없습니다.");
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
