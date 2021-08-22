import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Map<Integer, Integer> balls = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (!balls.containsKey(num)) {
                balls.put(num, 1);
            } else {
                balls.put(num, balls.get(num) + 1);
            }
        }
        List<Integer> list = new ArrayList<>(balls.values());
        list = list.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());

        int answer = 0;
        for (int i = 0; i < list.size() - k; i++) {
            answer += list.get(i);
        }
        System.out.println(answer);
    }
}
