import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        var r = Math.sqrt(n);
        long s = (long) Math.ceil(r);
        Integer min = null;
        for (int a = 1; a <= s; a++) {
            if (n % a == 0) {
                long b = n / a;
                int c = Math.max(getDigit(a), getDigit(b));
                if (min == null || c < min) {
                    min = c;
                }
            }
        }
        System.out.println(min);
    }

    static int getDigit(long num) {
        int digit = 1;
        while (num / 10 != 0) {
            digit++;
            num /= 10;
        }
        return digit;
    }
}
