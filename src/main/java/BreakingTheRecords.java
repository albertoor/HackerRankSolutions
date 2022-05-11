import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BreakingTheRecords {

    public static List<Integer> breakingRecords(List<Integer> scores) {
        int newScoreMax = scores.get(0);
        int newScoreMin = scores.get(0);
        int countHiScore = 0;
        int countLoScore = 0;
        for (int i = 0; i < scores.size(); i++) {
            if (scores.get(i) > newScoreMax) {
                newScoreMax = scores.get(i);
                countHiScore++;
            }
            if (scores.get(i) < newScoreMin){
                newScoreMin = scores.get(i);
                countLoScore++;
            }
        }

        return Arrays.asList(countHiScore, countLoScore);
    }

    public static void main(String[] args) {
        List<Integer> scores = new ArrayList<>();
        // 10 5 20 20 4 5 2 25 1
        scores.add(10);
        scores.add(5);
        scores.add(20);
        scores.add(20);
        scores.add(4);
        scores.add(5);
        scores.add(2);
        scores.add(25);
        scores.add(1);



        List<Integer> r = breakingRecords(scores);
        r.forEach(n -> System.out.println(n));
    }
}
