import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        String gap = " ";
        List<Character> charList = new ArrayList<>();

        for (int i = 0; i < string.length(); i++) {
            charList.add(string.charAt(i));
        }

        for (int i = 0; i < charList.size() - 1; i++) {
            if (charList.get(i).equals(gap.charAt(0)) && !charList.get(i + 1).equals(gap.charAt(0))) {
                charList.set(i + 1, Character.toUpperCase(charList.get(i + 1)));
            }
            if (i == 0 && !charList.get(i).equals(gap.charAt(0))) {
                charList.set(i, Character.toUpperCase(charList.get(i)));
            }
        }

        StringBuilder output = new StringBuilder();
        for (int i = 0; i < charList.size(); i++) {
            output.append(charList.get(i));
        }

        System.out.println(output);
    }
}
