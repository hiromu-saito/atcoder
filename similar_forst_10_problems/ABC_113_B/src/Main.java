import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double t = sc.nextInt();
        double a = sc.nextInt();
        int answer = 0;
        double minDiff = 0;

        for (int i = 0; i < n; i++) {
            double height = sc.nextInt();
            double diff = Math.abs(a - (t - height * 0.006));

            if (i == 0) {
                answer = i + 1;
                minDiff = diff;
            }
            if (minDiff >= diff) {
                answer = i + 1;
                minDiff = diff;
            }
        }
        System.out.println(answer);
    }
}
