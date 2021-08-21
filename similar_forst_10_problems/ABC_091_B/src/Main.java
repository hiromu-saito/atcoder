import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> candidates = new ArrayList<>();

        int n = sc.nextInt();
        List<String> redCards = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            redCards.add(s);
            if (!candidates.contains(s)) {
                candidates.add(s);
            }
        }

        int m = sc.nextInt();
        List<String> blueCards = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            String s = sc.next();
            blueCards.add(s);
            if (!candidates.contains(s)) {
                candidates.add(s);
            }
        }

        int money = 0;

        for (String c : candidates.toArray(new String[0])) {
            int plus = Math.toIntExact(redCards.stream().filter(r -> r.equals(c)).count());
            int minus = Math.toIntExact(blueCards.stream().filter(b -> b.equals(c)).count());
            int result = plus - minus;
            if (money < result) {
                money = result;
            }
        }
        System.out.println(money);
    }
}
