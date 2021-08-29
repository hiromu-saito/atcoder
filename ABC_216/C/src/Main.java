import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BigInteger i = BigInteger.valueOf(3);


        Scanner sc = new Scanner(System.in);
        BigInteger n = sc.nextBigInteger();
        List<String> operates = new ArrayList<>();
        String answer = "";
        while (n.compareTo(BigInteger.valueOf(0)) != 0) {
            if (!n.remainder(BigInteger.valueOf(2)).equals(BigInteger.valueOf(0))) {
                n = n.subtract(BigInteger.valueOf(1));
                answer = "A" + answer;
            } else {
                answer = "B" + answer;
                n = n.divide(BigInteger.valueOf(2));
            }
        }
        System.out.println(answer);
    }
}
