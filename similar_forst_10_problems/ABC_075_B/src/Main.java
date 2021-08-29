import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        String[] ss = new String[h];
        for (int i = 0; i < h; i++) {
            ss[i] = sc.next();
        }

        int[] dxs = {-1, 0, 1};
        int[] dys = {-1, 0, 1};

        String[][] answers = new String[h][w];

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (ss[i].charAt(j) == '#') {
                    answers[i][j] = "#";
                    continue;
                }

                int count = 0;
                for (int dx : dxs) {
                    for (int dy : dys) {
                        int y = i + dy;
                        int x = j + dx;
                        if (x >= 0 && x < w && y >= 0 && y < h) {
                            count += ss[y].charAt(x) == '#' ? 1 : 0;
                        }
                        answers[i][j] = String.valueOf(count);
                    }
                }
            }
        }
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                System.out.print(answers[i][j]);
            }
            System.out.println();
        }
    }
}
