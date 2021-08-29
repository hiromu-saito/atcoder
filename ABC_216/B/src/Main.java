import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] ss = new String[n];
        String[] ts = new String[n];

        for (int i = 0; i < n; i++) {
            ss[i] = sc.next();
            ts[i] = sc.next();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++)
                if (ss[i].equals(ss[j]) && ts[i].equals(ts[j])) {
                    System.out.println("Yes");
                    return;
                }
        }
        System.out.println("No");

    }
}
