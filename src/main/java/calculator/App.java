package calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        //Level1_1
        Scanner sc = new Scanner(System.in);
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
        int result =0;
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
                } else {
                    result = num1 / num2;
                }
                break;
            default:
                System.out.println("다시 입력해주세요");
                break;
        }

        System.out.println("결과 :" + result);

    }
}
