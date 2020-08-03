package JavaCorePro.Lesson_6;

public class Task1 {
    public static void main(String[] args) {
        Task1 task1 = new Task1();

        int[] arr1 = {1, 2, 4, 4, 2, 3, 4, 1, 7};
        int[] arr2 = {1, 2, 1, 4, 7};
        int[] arr3 = {2, 7};

        int[] arr1new = doTask1(arr1);
        int[] arr2new = doTask1(arr2);
//        int[] arr3new = doTask1(arr3); // - вызов исключения

        for (int i = 0; i < arr1new.length; i++) {
            System.out.print(arr1new[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < arr2new.length; i++) {
            System.out.print(arr2new[i] + " ");
        }
    }

    public static int[] doTask1(int[] arr) throws RuntimeException {
        int[] res = null;
        int i = arr.length - 1;
        int j = 0;
        boolean found = false;
        while (i >= 0 && !found) {
            found = arr[i] == 4;
            j = i;
            i--;
        }
        if(found) {
            res = new int[arr.length - j - 1];
            for (i = j + 1; i < arr.length; i++) {
                res[i - j - 1] = arr[i];
            }
        } else {
            throw new RuntimeException("Array have no 4");
        }
        return  res;
    }
}
