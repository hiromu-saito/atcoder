import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt();
        var list = new ArrayList<Integer>();
        for (int i = 0; i < n; i++){
            list.add(sc.nextInt());
        }

        int count = 0;
        while (list.stream().allMatch(l -> l % 2 == 0)){
            list = list.stream().map(l -> l / 2).collect(Collectors.toCollection(ArrayList::new));
            count++;
        }
        System.out.println(count);
    }
}
