import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] css = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                css[i][j] = sc.nextInt();
            }
        }
        int[] as = new int[3];
        int[] bs = new int[3];

        for (int i = 0; i < 100; i++) {
            as[0] = i;
            bs[0] = css[0][0] - i;
            bs[1] = css[0][1] - i;
            bs[2] = css[0][2] - i;
            as[1] = css[1][0] - bs[0];
            as[2] = css[2][0] - bs[0];
            if (check(as, bs, css)) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }

    static boolean check(int[] as, int[] bs, int[][] css) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (css[i][j] != as[i] + bs[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
