import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] list = new int[n];

        for (int i = 0; i < m; i++) {
            list[sc.nextInt() - 1]++;
            list[sc.nextInt() - 1]++;
        }

        for (int l : list) {
            System.out.println(l);
        }
    }
}
