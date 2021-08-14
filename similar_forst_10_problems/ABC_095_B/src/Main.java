import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int remaining = sc.nextInt();
        int min = 0;
        int answer = 0;

        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            if (i == 0 || m <= min) min = m;
            remaining -= m;
            answer++;
        }
        System.out.println(remaining / min + answer);
    }
}
