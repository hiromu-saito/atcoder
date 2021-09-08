import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ps = new int[n];

        for (int i = 0; i < n; i++) {
            ps[i] = sc.nextInt();
        }

        int[] qs = new int[n];
        for (int i = 0; i < n; i++) {
            qs[ps[i] - 1] = i + 1;
        }
        for (int q : qs) {
            System.out.print(q + " ");
        }
    }
}

