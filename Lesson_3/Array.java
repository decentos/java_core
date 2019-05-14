package JavaCore.Lesson_3;

import java.util.*;

public class Array {
    public static void main(String[] args) {

        String[] arr = new String[10];

        arr[0] = "Стол";
        arr[1] = "Дерево";
        arr[2] = "Холодильник";
        arr[3] = "Холодильник";
        arr[4] = "Дерево";
        arr[5] = "Метеор";
        arr[6] = "Телефон";
        arr[7] = "Телефон";
        arr[8] = "Холодильник";
        arr[9] = "Тостер";

        Set<String> set = new HashSet<>();
        set.addAll(Arrays.asList(arr));
        System.out.println(set);

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++){

            int count = 0;

            for (int j = 0; j < arr.length; j++){

                if (arr[i].equals(arr[j]))
                    count++;
            }

            map.put(arr[i], count);
        }

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }
}
