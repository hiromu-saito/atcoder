import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                int a = list.get(i);
                int b = list.get(j);
                if (a == b) {
                    continue;
                }
                for (int k = j + 1; k < list.size(); k++) {
                    int c = list.get(k);
                    if (a == c || b == c) {
                        continue;
                    }
                    if (a < b + c && b < a + c && c < a + b) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
