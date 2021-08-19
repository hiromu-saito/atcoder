import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int count = 0;
        int[][] num = new int[n][d];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < d; j++) {
                num[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int r = 0;
                for (int k = 0; k < d; k++) {
                    r += Math.pow(num[j][k] - num[i][k], 2);
                }
                double sq = Math.sqrt(r);
                if (sq - Math.floor(sq) == 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
