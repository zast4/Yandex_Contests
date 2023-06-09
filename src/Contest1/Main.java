package Contest1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] reservoirs = new int[n];
        for (int i = 0; i < n; i++) {
            reservoirs[i] = sc.nextInt();
        }
        long time = System.currentTimeMillis();
        int max = reservoirs[0];
        int min = reservoirs[0];
        int answer = 0;
        for (int i = 1; i < n - 1; i++) {
            max = reservoirs[i] > max ? reservoirs[i] : max;
            min = reservoirs[i] < min ? reservoirs[i] : min;
            if (max > reservoirs[i + 1]) {
                answer = -1;
                break;
            }
        }
        max = reservoirs[n - 1] > max ? reservoirs[n - 1] : max;
        min = reservoirs[n - 1] < min ? reservoirs[n - 1] : min;
        if (answer == -1) {
            System.out.println(-1);
        } else {
            System.out.println(max - min);
        }
    }
}