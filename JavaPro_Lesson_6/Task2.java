package JavaCorePro.Lesson_6;

public class Task2 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 4, 2, 3, 4, 1, 7};
        int[] arr2 = {1, 4, 1, 4};
        int[] arr3 = {2, 7};

        System.out.println(doTask2(arr1));
        System.out.println(doTask2(arr2));
        System.out.println(doTask2(arr3));


    }

    public static boolean doTask2(int[] arr) {
        boolean res = true;
        int count1 = 0;
        int count4 = 0;
        int i = 0;
        while (i < arr.length && res) {
            if (arr[i] == 1) {
                res = true;
                count1++;
            } else {
                if (arr[i] == 4) {
                    res = true;
                    count4++;
                } else {
                    res = false;
                }
            }
            i++;
        }
        return res && count1 > 0 && count4 > 0;
    }

}

