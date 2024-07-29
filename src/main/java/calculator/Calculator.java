package calculator;

import java.util.ArrayList;

public class Calculator {

    public Calculator() {
        ArrayList<Double> results = new ArrayList<>();
    }

    public double calculate(int num1, int num2, char op) throws DivisionException {
        double result;
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
                    throw new DivisionException("나눗셈 연산에서 분모에 0이 입력이 불가능입니다.");
                } else {
                    result = (double)num1 / num2;
                }
                break;
            default:
                throw new DivisionException("다시 입력해주세요");
        }
        return result;
    }
}
