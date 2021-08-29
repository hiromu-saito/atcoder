import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float f = sc.nextFloat();
        int x = (int) f;
        double y = Math.ceil((f - x) * 10);
        if (0 <= y && y <= 2) {
            System.out.println(x + "-");
        } else if (3 <= y && y <= 6) {
            System.out.println(x);
        } else if (7 <= y && y <= 9) {
            System.out.println(x + "+");
        }

    }
}
