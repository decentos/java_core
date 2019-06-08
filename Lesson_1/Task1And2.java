package JavaCorePro.Lesson_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1And2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        changeElement(arr, 3, 1);
        System.out.println(Arrays.toString(arr));

        fromArrToList(arr);
    }

    // Написать метод, который меняет два элемента массива местами:
    public static void changeElement(int[] arr, int from, int to) {
        int[] arr1 = Arrays.copyOf(arr, arr.length);
        arr[from] = arr[to];
        arr[to] = arr1[from];
    }

    // 2. Написать метод, который преобразует массив в ArrayList:
    public static void fromArrToList(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
    }
}
