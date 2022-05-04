import javafx.scene.layout.HBox;

import java.util.ArrayList;
import java.util.List;


public class CompareTheTriplets {

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int aliceScore = 0, bobScore = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) aliceScore++;
            else if (b.get(i) > a.get(i)) bobScore++;
            else continue;
        }
        List<Integer> result = new ArrayList<>();
        result.add(aliceScore);
        result.add(bobScore);
        return result;
    }

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(5);
        a.add(6);
        a.add(7);
        List<Integer> b = new ArrayList<>();
        b.add(3);
        b.add(6);
        b.add(10);
        List<Integer> list = compareTriplets(a, b);
        list.stream().forEach(System.out::println);
    }
}
