package JavaCore.MyException;

public class MyArraySizeException extends Exception {

    public MyArraySizeException() {
        super("Размерность массива должна быть 4х4.");
    }
}
