package Dz_2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class task_1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("file.txt");
        fileOutputStream.write(buildString(6, 'a', 'b').getBytes());
        fileOutputStream.write(repeatText(100, "TEXT").getBytes());

    }

    private static String buildString(int n, char first, char second) {
        String str = new String();
        for (int i = 0; i < n; i++) {
            str += (i % 2 == 0) ? first : second;
        }
        return str;
    }

    private static String repeatText(int n, String text) {
        String str = new String();
        str += "\n";
        for (int i = 0; i < n; i++) {
            str += text + " ";
        }
        return str;
    }

}