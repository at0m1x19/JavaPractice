
/* 
Переходим дорогу вслепую
Работа светофора для пешеходов запрограммирована следующим образом:
в начале каждого часа в течение трех минут горит зелёный сигнал,
затем в течение одной минуты - жёлтый,
а потом в течение одной минуты - красный,
затем опять зелёный горит три минуты и т. д.
Ввести с клавиатуры вещественное число t, означающее время в минутах, прошедшее с начала очередного часа.
Определить, сигнал какого цвета горит для пешеходов в этот момент.
*/

import java.io.*;

public class Solution {
    static void green() {
        System.out.println("зелёный");
    }
    static void red() {
        System.out.println("красный");
    }
    static void yellow() {
        System.out.println("жёлтый");
    }

    static double cleanTime(double minute) {
        if (minute >= 5.0) {
            minute = minute % 5.0;
        }
        else {
            return minute;
        }
        return minute;
    }

    static void currentLight(double minute) {
        double checkTime = cleanTime(minute);
        if (checkTime >= 0 && checkTime < 3) {
            green();
        }
        else if (checkTime >= 3 && checkTime < 4) {
            yellow();
        }
        else {
            red();
        }
    }
    
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double minute = Double.parseDouble(reader.readLine());
        currentLight(minute);
    }

}