/* 
Выведи на экран таблицу умножения 10 на 10
*/

public class Solution {
    public static void main(String[] args) {
        int add;
        int number;

        for (int j = 1; j <= 10; j++) {
            number = 0;
            add = 0;
            add += j;

            for (int i = 1; i <= 10; i++) {
                System.out.print(number + add + " ");
                number += add;
            }
            System.out.println("");
        }
    }
}
