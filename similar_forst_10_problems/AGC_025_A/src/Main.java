import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = 0;

        while (n != 0) {
            if (n % 10 == 0 && answer == 0) {
                answer = 10;
                break;
            }
            answer += n % 10;
            n /= 10;
        }
        System.out.println(answer);
    }
}
