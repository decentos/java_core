package JavaCorePro.Lesson_1.Task3;

public class Main {
    public static void main(String[] args) {
        Apple apl = new Apple();
        Orange orange = new Orange();

        Box<Apple> boxApple = new Box<>();
        boxApple.addFruit(apl);
        boxApple.addFruit(apl);
        boxApple.addFruit(apl);

        Box<Orange> boxOrange = new Box<>();
        boxOrange.addFruit(orange);
        boxOrange.addFruit(orange);
        boxOrange.addFruit(orange);
        boxOrange.addFruit(orange);
        boxOrange.addFruit(orange);

        boxApple.compare(boxOrange);
    }
}
