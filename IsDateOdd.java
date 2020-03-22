import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/* 
Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате FEBRUARY 1 2013
*/

public class Solution {
    public static void main(String[] args) throws ParseException {
        System.out.println(isDateOdd("May 1 2013"));
    }

    public static boolean isDateOdd(String date) throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat("MMM dd yyyy", Locale.US);
        Date inputDate = df.parse(date);
        GregorianCalendar gc = new GregorianCalendar();
        gc.setTime(inputDate);

        if (gc.get(GregorianCalendar.DAY_OF_YEAR) % 2 == 0) {
            return false;
        }
        else {
            return true;
        }
    }
}
