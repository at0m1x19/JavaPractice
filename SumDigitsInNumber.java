/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        //напишите тут ваш код
        int third = number % 10;
        int second = (number / 10) % 10;
        int first = (number / 10) / 10;

        number = first + second + third;

        return number;
    }
}