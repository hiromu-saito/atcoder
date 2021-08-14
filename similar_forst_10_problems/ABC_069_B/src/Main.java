import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var s = sc.nextLine();
        int i = s.length() -2;
        var begin = String.valueOf(s.charAt(0));
        var end = String.valueOf(s.charAt(s.length()-1));
        System.out.println(begin + i + end);
    }
}
