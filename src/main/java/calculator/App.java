package calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        //1번쨰 숫자 입력 받기
        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1 = scanner1.nextInt();
        System.out.println("첫번째 숫자 : " + num1);

        //2번쨰 숫자 입력 받기
        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = scanner1.nextInt();
        System.out.println("두번째 숫자 : " + num2);

    }
}
//