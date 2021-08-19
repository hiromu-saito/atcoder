import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean b = false;
        for (int i = 0; i <= 100 / 7; i++) {
            for (int j = 0; j <= 100 / 4; j++) {
                if (i * 7 + j * 4 == n) {
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
