import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] xs = new int[n];
        int[] ys = new int[n];
        int[] hs = new int[n];
        for (int i = 0; i < n; i++) {
            xs[i] = sc.nextInt();
            ys[i] = sc.nextInt();
            hs[i] = sc.nextInt();
        }

        //i はCx
        for (int i = 0; i <= 100; i++) {
            //jはCy
            for (int j = 0; j <= 100; j++) {
                int h = 0;
                for (int k = 0; k < n; k++) {
                    if (hs[k] > 0) {
                        h = hs[k] + Math.abs(i - xs[k]) + Math.abs(j - ys[k]);
                    }
                }
                boolean judge = true;

                for (int k = 0; k < n; k++) {
                    if (!check(h, xs[k], i, ys[k], j, hs[k])) {
                        judge = false;
                        break;
                    }
                }
                if (judge) {
                    System.out.println(i + " " + j + " " + h);
                    return;
                }
            }
        }

    }

    static boolean check(int h, int x, int cx, int y, int cy, int hi) {
        return hi == Math.max(h - Math.abs(x - cx) - Math.abs(y - cy), 0);
    }
}
