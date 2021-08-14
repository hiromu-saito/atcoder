import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean findA = false;
        boolean findZ = false;
        int indexA = 0;
        int indexZ = 0;

        for (int i = 0; i < s.length() && !(findA & findZ); i++) {
            if (!findA && s.charAt(i) == 'A') {
                indexA = i;
                findA = true;
            }
            if (!findZ && s.charAt(s.length() - (i + 1)) == 'Z') {
                indexZ = s.length() - i;
                findZ = true;
            }
        }
        System.out.println(indexZ - indexA);
    }
}
