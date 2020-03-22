import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Пользователь вводит с клавиатуры список слов (и чисел).
Слова вывести в возрастающем порядке, числа - в убывающем.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) {
                break;
            }
            list.add(s);
        }

        String[] array = list.toArray(new String[0]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        List<Integer> indexOfNumbers = new ArrayList<>();
        List<Integer> indexOfStrings = new ArrayList<>();
        
        String temp;
        int indexOfCurrentElement;
        int indexOfNextElement;

        for (int i = 0; i < array.length; i++) {
            if (isNumber(array[i])) {
                indexOfNumbers.add(i);
            }
            else {
                indexOfStrings.add(i);
            }
        }

        Integer[] arrayIndexOfNumbers = indexOfNumbers.toArray(new Integer[0]);
        Integer[] arrayIndexOfStrings = indexOfStrings.toArray(new Integer[0]);

        for (int i = 0; i < arrayIndexOfNumbers.length - 1; i++) {
            for (int j = 0; j < arrayIndexOfNumbers.length - i - 1; j++) {
                indexOfCurrentElement = arrayIndexOfNumbers[j];
                indexOfNextElement = arrayIndexOfNumbers[j+1];

                if (Integer.parseInt(array[indexOfCurrentElement]) < Integer.parseInt(array[indexOfNextElement])) {
                    temp = array[indexOfNextElement];
                    array[indexOfNextElement] = array[indexOfCurrentElement];
                    array[indexOfCurrentElement] = temp;
                }
            }
        }

        for (int i = 0; i < arrayIndexOfStrings.length - 1; i ++) {
            for (int j = 0; j < arrayIndexOfStrings.length - i - 1; j++) {
                indexOfCurrentElement = arrayIndexOfStrings[j];
                indexOfNextElement = arrayIndexOfStrings[j+1];

                if (isGreaterThan(array[indexOfCurrentElement], array[indexOfNextElement])) {
                    temp = array[indexOfNextElement];
                    array[indexOfNextElement] = array[indexOfCurrentElement];
                    array[indexOfCurrentElement] = temp;
                }
            }
        }
    }

    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    public static boolean isNumber(String s) {
        if (s.length() == 0) {
            return false;
        }

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-')
                    || (!Character.isDigit(c) && c != '-') 
                    || (chars.length == 1 && c == '-'))
            {
                return false;
            }
        }
        return true;
    }
}
