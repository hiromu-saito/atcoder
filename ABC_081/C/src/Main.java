import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        List<String> list = new ArrayList<>();
        permutation(s, "", list);
        list = list.stream().distinct().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        System.out.println(list.get(k - 1));
    }

    public static void permutation(String q, String ans, List<String> list) {
        if (q.length() <= 1) {
            list.add(ans + q);
        } else {
            for (int i = 0; i < q.length(); i++) {
                permutation(q.substring(0, i) + q.substring(i + 1),
                        ans + q.charAt(i), list);
            }
        }
    }
}