import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: "фамилия" - "дата рождения".
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));
        map.put("Петров", dateFormat.parse("AUGUST 1 1997"));
        map.put("Сидоров", dateFormat.parse("DECEMBER 13 1999"));
        map.put("Зидан", dateFormat.parse("MARCH 19 1988"));
        map.put("Парфенов", dateFormat.parse("JUNE 30 1991"));
        map.put("Титов", dateFormat.parse("OCTOBER 22 1990"));
        map.put("Никифоров", dateFormat.parse("AUGUST 01 1993"));
        map.put("Цымбаларь", dateFormat.parse("JULY 11 1992"));
        map.put("Кофтун", dateFormat.parse("MARCH 4 1995"));
        map.put("Сметанин", dateFormat.parse("MARCH 6 1996"));

        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        Iterator<Map.Entry<String, Date>> myIterator = map.entrySet().iterator();

        while (myIterator.hasNext()) {
            String date = myIterator.next().getValue().toString();
            if (date.contains("Aug") || date.contains("Jul") || date.contains("Jun")) {
                myIterator.remove();
            }
        }
    }

    public static void main(String[] args) throws ParseException {

    }
}
