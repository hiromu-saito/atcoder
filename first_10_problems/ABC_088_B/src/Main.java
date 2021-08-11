import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> cardList = new ArrayList<>();
        for(int i = 0; i < n; i++){
            cardList.add(sc.nextInt());
        }

        List<Integer> alice = new ArrayList<>();
        List<Integer> bob = new ArrayList<>();

        boolean aliceTurn = true;
        while (!cardList.isEmpty()){
            Integer maxCard = Collections.max(cardList);
            cardList.remove(maxCard);
            if (aliceTurn) {
                alice.add(maxCard);
            } else {
                bob.add(maxCard);
            }
            aliceTurn = !aliceTurn;
        }
        int aliceSum = alice.stream().mapToInt(i ->i).sum();
        int bobSum = bob.stream().mapToInt(i ->i).sum();
        System.out.println(aliceSum - bobSum);
    }
}
