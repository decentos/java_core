package JavaCore.Lesson_3;

public class CheckPassword {
    public static void main(String[] args) {

        check("a1s");

    }

    public static void check(String pass) {
        char[] arr = pass.toCharArray();

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == '0' || arr[i] == '1' || arr[i] == '2' || arr[i] == '3' || arr[i] == '4' ||
                arr[i] == '5' || arr[i] == '6' || arr[i] == '7' || arr[i] == '8' || arr[i] == '9') {
                break;
            } //else {
//                System.err.println("Пароль должен содержать хотя бы одну цифру!");
//            }
        }

        if (arr.length < 8) {
            System.err.println("Пароль должен быть не менее 8 символов!");
        } else if (arr.length > 20) {
            System.err.println("Пароль должен быть не более 20 символов!");
        }

        /*
         *
         * 3 Должны быть большие и маленькие буквы
         * 4 Обязательно дожен быть спец символ
         * Можно написать также, как проверку на числа, но получится слишком объемный код
         * Оптимального решения не получилось найти
         *
         */

    }
}
