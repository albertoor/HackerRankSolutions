import java.util.ArrayList;
import java.util.List;

public class BirthdayCakeCandles {

    public static int birthdayCakeCandles(List<Integer> candles) {
        int higher = candles.stream().mapToInt(Integer::intValue).max().getAsInt();
        int count = 0;
        for (Integer candle: candles) if (candle == higher) count++;
        return count;
    }

    public static void main(String[] args) {
        List<Integer> candles = new ArrayList<>();
        candles.add(4);
        candles.add(4);
        candles.add(1);
        candles.add(3);
        int n = birthdayCakeCandles(candles);
        System.out.println(n);
    }
}
