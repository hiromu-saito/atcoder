import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean b = false;
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                if (i * j == n) {
                    b = true;
                    break;
                }
            }
        }
        if (b) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
