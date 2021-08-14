import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int i = Math.toIntExact(Stream.of(s.split("")).filter(e -> e.equals("o")).count());
        System.out.println(700 + i * 100);
    }
}
