package JavaCore.Lesson_3;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        add(map,555_23_12, "Петров");
        add(map,551_80_67, "Иванов");
        add(map,632_15_89, "Петров");

        get(map, "Петров");


    }

    public static Map<Integer, String> add(Map<Integer, String> map, int number, String name) {

        map.put(number, name);

        return map;
    }

    public static void get(Map<Integer, String> map, String name) {

        for (Map.Entry<Integer, String> pair : map.entrySet()) {
            if (name.equalsIgnoreCase(pair.getValue())) {
                System.out.println(pair.getKey());
            }
        }
    }
}
