import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] as = new int[n];

        for (int i = 0; i < n; i++) {
            as[i] = sc.nextInt();
        }

        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (as[j] > as[j + 1]) {
                    int temp = as[j];
                    as[j] = as[j + 1];
                    as[j + 1] = temp;
                }
            }
        }
        int answer = 0;

        for (int a : as) {
            if (x >= a) {
                x -= a;
                answer++;
            } else {
                break;
            }
        }
        if (answer == n && x != 0) answer--;
        System.out.println(answer);
    }
}
