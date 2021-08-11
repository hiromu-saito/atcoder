import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        int count = 0;
        for (int i = 0; i < s.length();i++){
            if(s.charAt(i) == '1'){
                count++;
            }
        }
        System.out.println(count);
    }
}
