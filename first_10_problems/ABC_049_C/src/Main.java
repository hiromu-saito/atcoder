import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        while (!s.equals("")) {
            if (dreamOrEraseCheck(s)) {
                s = s.substring(0, s.length() - 5);
                continue;
            }
            if (eraserCheck(s)) {
                s = s.substring(0, s.length() - 6);
                continue;
            }
            if (dreamerCheck(s)) {
                s = s.substring(0, s.length() - 7);
                continue;
            }
            break;
        }
        if (s.equals("")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    //末尾5文字がdream or eraseであるかを判定する
    public static boolean dreamOrEraseCheck(String s) {
        String lastFive = s.substring(s.length() - 5);
        return lastFive.equals("dream") || lastFive.equals("erase");
    }

    //末尾6文字がeraserであるかを判定する
    public static boolean eraserCheck(String s) {
        String lastSix = s.substring(s.length() - 6);
        return lastSix.equals("eraser");
    }

    //末尾7文字がdreamerであるかを判定する
    public static boolean dreamerCheck(String s) {
        String lastSeven = s.substring(s.length() - 7);
        return lastSeven.equals("dreamer");
    }

}
