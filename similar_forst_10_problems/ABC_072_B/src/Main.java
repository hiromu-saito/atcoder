import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] ss = sc.nextLine().split("");
        StringBuilder sb = new StringBuilder();

        for(int i = 1; i <= ss.length; i++){
            if(i %2 != 0){
                sb.append(ss[i-1]);
            }
        }

        System.out.println(sb.toString());
    }
}
