import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>() {{
            add("ABC");
            add("ARC");
            add("AGC");
            add("AHC");
        }};
        list.remove(list.indexOf(sc.next()));
        list.remove(list.indexOf(sc.next()));
        list.remove(list.indexOf(sc.next()));
        System.out.println(list.get(0));
    }
}
