import java.io.*;

/* 
Чётные и нечётные циферки
Ввести с клавиатуры число. Определить, сколько в введенном числе четных цифр, а сколько нечетных.
Если число делится без остатка на 2 (т. е. остаток равен нулю), значит оно четное.
Увеличиваем на 1 счетчик четных цифр (статическая переменная even).
Иначе число нечетное, увеличиваем счетчик нечетных цифр (статическая переменная odd).
Вывести на экран сообщение: "Even: а Odd: b", где а - количество четных цифр, b - количество нечетных цифр.
*/

public class Solution {

    public static int even;
    public static int odd;

    static void printResult() {
        System.out.println("Even: " + even + " Odd: " + odd);
    }

    public static void main(String[] args) throws IOException {
    
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());

        if (number == 0) {
            even++;
            printResult();
        } else {
            while (number != 0) {
                if ((number % 10) % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
                number /= 10;
            }

            printResult();
        }
    }
}
