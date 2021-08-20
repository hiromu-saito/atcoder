import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        s = Stream.of(s.split("")).sorted(
                Comparator.naturalOrder()).collect(Collectors.joining());

        t = Stream.of(t.split("")).sorted(
                Comparator.reverseOrder()).collect(Collectors.joining());

        if (s.compareTo(t) < 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
