package File;

import java.io.File;
import java.util.Objects;

public class Main1 {
    static void listFiles(String basePath, int c) {
        File file = new File(basePath);

        for (File file1 : Objects.requireNonNull(file.listFiles())) {
            int c1 = c;
            if (file1.isDirectory()) {
                System.out.println(fillStr(c) + "->" + file1.getName());
                listFiles(file1.getPath(), ++c);
            } else {
                System.out.println(fillStr(c) + "-->" + file1.getName());
            }
            c = c1;
        }
    }

    static String fillStr(int len) {
        return String.valueOf(' ').repeat(len - "".length());
    }

    public static void main(String[] args) {
        String basePath = "/home/cyber/Desktop/test";
        listFiles(basePath, 1);
//        System.out.println(fillStr(5));
    }
}
