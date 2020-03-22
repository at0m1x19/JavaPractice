package com.javarush.task.task08.task0817;

import java.util.*;

/* 
Нам повторы не нужны
Создать словарь (Map<String, String>) занести в него десять записей по принципу "фамилия" - "имя".
Удалить людей, имеющих одинаковые имена.
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> myHashMap = new HashMap<>();

        myHashMap.put("Ivanov", "Petr");
        myHashMap.put("Petrov", "Alex");
        myHashMap.put("Semenov", "Ivan");
        myHashMap.put("Andreev", "Petr");
        myHashMap.put("Nickolaev", "Egor");
        myHashMap.put("Karpov", "Andrey");
        myHashMap.put("Denisov", "Petr");
        myHashMap.put("Egorov", "Egor");
        myHashMap.put("Vorobiev", "Lol");
        myHashMap.put("Ermakov", "Alex");

        return myHashMap;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        ArrayList<String> valuesForDelete = new ArrayList<>(map.values());
        List<String> alreadyDeletedValues = new ArrayList<>();

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
