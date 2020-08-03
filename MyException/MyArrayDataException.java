package JavaCore.MyException;

public class MyArrayDataException extends Exception {

    public MyArrayDataException(int row, int col) {
        super(String.format("В момент преобразования возникла ошибка на позиции: [%d, %d]", row, col));
    }
}
