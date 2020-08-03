package JavaCore.MyException;

public class MainTest {
    public static void main(String[] args) {
        String[][] arrayTrue = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}};

        String[][] arrayFalse = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2"},
                {"1", "2", "3", "4"}};

        String[][] arrayString = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "Ошибка", "4"},
                {"1", "2", "3", "4"}};

        try {
            System.out.println(CheckArray.createArray(arrayTrue));

        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());

        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(CheckArray.createArray(arrayFalse));

        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(CheckArray.createArray(arrayString));

        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

    }
}
