/* 
Калькулятор
*/

import java.math.BigDecimal;

public class Calculator {
    public static int plus(int a, int b) {
        return a + b;
    }

    public static int minus(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double division(int a, int b) {
        BigDecimal number1 = new BigDecimal(a);
        BigDecimal number2 = new BigDecimal(b);
        return number1.divide(number2, 2, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    public static double percent(int a, int b) {
        BigDecimal number1 = new BigDecimal(a);
        BigDecimal number2 = new BigDecimal(b);
        BigDecimal hundred = new BigDecimal(100);
        return number2.multiply(number1.divide(hundred)).doubleValue();
    }

    public static void main(String[] args) {

    }
}