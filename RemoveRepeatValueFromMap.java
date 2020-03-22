import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Нам повторы не нужны
Создать словарь (Map<String, String>) занести в него десять записей по принципу "фамилия" - "имя".
Удалить людей, имеющих одинаковые имена.
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> myHashMap = new HashMap<>();

        myHashMap.put("Ivanov", "Egor");
        myHashMap.put("Petrov", "Zaim");
        myHashMap.put("Semenov", "Ivan");
        myHashMap.put("Andreev", "Nick");
        myHashMap.put("Nickolaev", "Egor");
        myHashMap.put("Karpov", "Andrey");
        myHashMap.put("Denisov", "Petr");
        myHashMap.put("Egorov", "Egor");
        myHashMap.put("Vorobiev", "Lol");
        myHashMap.put("Ermakov", "Alex");

        return myHashMap;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        Iterator<Map.Entry<String, String>> myIterator = map.entrySet().iterator();
        ArrayList<String> valuesForDelete = new ArrayList<>();
        ArrayList<String> alreadyDeletedValues = new ArrayList<>();

        while (myIterator.hasNext()) {
            valuesForDelete.add(myIterator.next().getValue());
        }

        for (int i = 0; i < valuesForDelete.size(); i++) {
            for (int j = i + 1; j < valuesForDelete.size(); j++ ) {
                if (valuesForDelete.get(i).equals(valuesForDelete.get(j))) {
                    if (!alreadyDeletedValues.contains(valuesForDelete.get(i))) {
                        removeItemFromMapByValue(map, valuesForDelete.get(i));
                        alreadyDeletedValues.add(valuesForDelete.get(i));
                        break;
                    }
                }
            }

        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}
