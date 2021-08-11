import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int answer = 0;

        for (int i = 1; i <= n; i++) {
            int sum = digitSum(i);
            if (sum >= a && sum <= b) {
                answer += i;
            }
        }
        System.out.println(answer);
    }

    public static int digitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
