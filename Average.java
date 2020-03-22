import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Среднее арифметическое
Вводить с клавиатуры числа и вычислить среднее арифметическое.
Если пользователь ввел -1, вывести на экран среднее арифметическое всех чисел и завершить программу.
-1 не должно учитываться.
*/

public class Solution {

    public static double average(double sum, int count) {
        return sum / count;
    }

    public static void main(String[] args) throws Exception {
    
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double sum = 0;
        int count = 0;

        while (true) {

            int number = Integer.parseInt(reader.readLine());
            if (number == -1) {
                System.out.println(average(sum, count));
                break;
            }
            else {
                sum += number;
                count++;
            }
        }
    }
}