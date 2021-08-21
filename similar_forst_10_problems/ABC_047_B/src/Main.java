import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int n = sc.nextInt();

        int[][] rectangle = new int[h][w];

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            switch (sc.nextInt()) {
                case 1:
                    for (int j = 0; j < x; j++) {
                        for (int k = 0; k < h; k++) {
                            rectangle[k][j] = 1;
                        }
                    }
                    break;
                case 2:
                    for (int j = w - 1; j > x - 1; j--) {
                        for (int k = 0; k < h; k++) {
                            rectangle[k][j] = 1;
                        }
                    }
                    break;
                case 3:
                    for (int j = 0; j < y; j++) {
                        for (int k = 0; k < w; k++) {
                            rectangle[j][k] = 1;
                        }
                    }
                    break;
                case 4:
                    for (int j = h - 1; j > y - 1; j--) {
                        for (int k = 0; k < w; k++) {
                            rectangle[j][k] = 1;
                        }
                    }
                    break;
            }
        }
        int count = 0;
        for (int[] r : rectangle) {
            for (int i : r) {
                if (i == 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
