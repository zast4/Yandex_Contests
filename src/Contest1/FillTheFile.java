package Contest1;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class FillTheFile {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = 100000;
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("test.txt"), StandardCharsets.UTF_8));
        writer.append(String.valueOf(n));
        writer.append('\n');
        writer.append("1");
        for (int i = 2; i <= n; i++) {
            writer.append(" " + i);
        }
        writer.close();
    }
}
