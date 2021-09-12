import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] dictionary = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] ss = s.split(" ");
        int[] ps = new int[ss.length];
        for (int i = 0; i < ps.length; i++) {
            ps[i] = Integer.parseInt(ss[i]);
        }
        for (int p : ps) {
            System.out.print(dictionary[p - 1]);
        }
    }
}
