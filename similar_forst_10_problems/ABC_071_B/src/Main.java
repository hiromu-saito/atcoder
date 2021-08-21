import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] alpha = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        var list = new ArrayList<>(Arrays.asList(alpha));
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        var inputs = s.split("");
        for (String input : inputs) {
            list.remove(input);
        }
        if (list.size() == 0) {
            System.out.println("None");
        } else {
            System.out.println(list.stream().min(Comparator.naturalOrder()).get());
        }
    }
}
