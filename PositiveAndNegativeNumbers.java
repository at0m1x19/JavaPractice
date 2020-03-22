
/* 
Положительные и отрицательные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе, в следующем виде:
"количество отрицательных чисел: а", "количество положительных чисел: б",
где а, б - искомые значения.
*/

import java.io.*;

public class Solution {

    static void countNumbers(int[] numbers) {
        int countPos = 0;
        int coutnNeg = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                countPos++;
            }
            else if (numbers[i] < 0) {
                coutnNeg++;
            }
        }
        System.out.println("количество отрицательных чисел: " + coutnNeg);
        System.out.println("количество положительных чисел: " + countPos);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader3 = new BufferedReader(new InputStreamReader(System.in));

        int[] numbers = {Integer.parseInt(reader1.readLine()), Integer.parseInt(reader2.readLine()), Integer.parseInt(reader3.readLine())};

        countNumbers(numbers);

    }
}
