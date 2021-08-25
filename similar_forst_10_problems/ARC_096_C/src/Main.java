import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        Integer min = null;

        for (int i = 0; i <= 2 * Math.max(x, y); i++) {
            int cNum = i;
            int aNum = Math.max(0,x - cNum / 2);
            int bNum = Math.max(0,y - cNum / 2);
            var min1 = a * aNum + b * bNum + c * cNum;
            if (min == null || min1 <= min) {
                min = min1;
            }
        }
        System.out.println(min);
    }
}