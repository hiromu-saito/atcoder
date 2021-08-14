import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        int min = 0;

        for(int i = 0; i < n; i++ ){
            int num = sc.nextInt();
            if(i == 0){
                max = num;
                min = num;
            }
            if(max <= num){
                max = num;
            }
            if(min >= num){
                min = num;
            }
        }
        System.out.println(Math.abs(max-min));
    }
}
