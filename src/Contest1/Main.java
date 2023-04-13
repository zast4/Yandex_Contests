package Contest1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Scanner fileScanner = new Scanner(new InputStreamReader(new FileInputStream("test.txt")));
        int n = Integer.parseInt(fileScanner.nextLine());
        int[] reservoirs = new int[n];
        for (int i = 0; i < n; i++) {
            reservoirs[i] = fileScanner.nextInt();
        }
//        System.out.println(n);
//        for (int el : reservoirs) {
//            System.out.print(el + " ");
//        }
        long time = System.currentTimeMillis();
        int dif = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (reservoirs[i] > reservoirs[j]) {
                    dif = -1;
                    break;
                }
                else if (reservoirs[j] - reservoirs[i] > dif) {
                    dif = reservoirs[j] - reservoirs[i];
                }
            }
            if (dif == -1) {
                break;
            }
        }
        System.out.println(dif);
        System.out.println(System.currentTimeMillis() - time);
    }
}