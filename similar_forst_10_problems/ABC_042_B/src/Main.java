import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        String[] ss = new String[n];
        for (int i = 0; i < n; i++) {
            ss[i] = sc.next();
        }

        for (int i = ss.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (ss[j].compareTo(ss[j + 1]) > 0) {
                    String tmp = ss[j];
                    ss[j] = ss[j + 1];
                    ss[j + 1] = tmp;
                }
            }
        }

        for (String s : ss) {
            System.out.print(s);
        }
    }
}