package JavaCorePro.Lesson_3;

import java.io.*;
import java.util.*;

public class Lesson_3_Task_1 {
    public static void main(String[] args) throws IOException {
        try {
            BufferedInputStream in = new BufferedInputStream(new FileInputStream("Text/1.txt"));
            ByteArrayOutputStream out = new ByteArrayOutputStream();

            int x;
            while ((x = in.read()) != -1) {
                out.write(x);
            }

            byte[] b = out.toByteArray();
            System.out.println(Arrays.toString(b));
            in.close();
            out.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
