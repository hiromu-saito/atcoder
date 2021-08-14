import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = 1;
        int count = 0;

        for (int i = 1; i <= n; i++){
            int num = i;
            int c = 0;
            while(num%2 == 0 && num != 0){
                c++;
                num /= 2;
            }
            if(count < c){
                answer = i;
                count = c;
            }
        }
        System.out.println(answer);
    }
}
