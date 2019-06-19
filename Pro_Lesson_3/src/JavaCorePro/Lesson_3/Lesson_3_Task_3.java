package JavaCorePro.Lesson_3;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Lesson_3_Task_3 {
    public static void main(String[] args) throws IOException {
        final int PAGE_SIZE = 1800;
        RandomAccessFile raf = new RandomAccessFile("Text/1.txt", "r");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите страницу: ");
        int p = sc.nextInt() - 1;
        raf.seek(p * PAGE_SIZE);
        byte[] barr = new byte[1800];
        raf.read(barr);
        System.out.println(new String(barr));
        raf.close();
    }
}
