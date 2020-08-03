package JavaCorePro.Lesson_3;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Lesson_3_Task_2 {
    public static void main(String[] args) throws IOException {
        long a = System.currentTimeMillis();

        ArrayList<InputStream> al = new ArrayList<>();
        try {
            al.add(new FileInputStream("Text/1.txt"));
            al.add(new FileInputStream("Text/2.txt"));
            al.add(new FileInputStream("Text/3.txt"));

            BufferedInputStream in = new BufferedInputStream(new SequenceInputStream(Collections.enumeration(al)));
            BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("out.txt"));
            int x;
            while ((x = in.read()) != -1) {
                out.write(x);
                System.out.println((char) x);
            }
            in.close();
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(System.currentTimeMillis() - a);
    }
}
