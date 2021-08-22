import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = Long.parseLong(sc.next());
        int k = 0;

        while (Math.round(Math.pow(2, k)) <= n) {
            k++;
        }
        k--;
        System.out.println(k);
    }
}
