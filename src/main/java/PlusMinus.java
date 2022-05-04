import java.math.BigDecimal;
import java.util.List;

import static java.math.BigDecimal.ROUND_HALF_UP;

public class PlusMinus {
    public static void plusMinus(List<Integer> arr) {
        int positives = 0, negatives = 0, zeros = 0, scale = 6, arrSize = arr.size();
        for (Integer number : arr) {
            if (number > 0) positives++;
            else if (number < 0) negatives++;
            else if (number == 0) zeros++;
        }
        System.out.println(new BigDecimal((double) positives / arrSize).setScale(scale, ROUND_HALF_UP));
        System.out.println(new BigDecimal((double) negatives / arrSize).setScale(scale, ROUND_HALF_UP));
        System.out.println(new BigDecimal((double) zeros / arrSize).setScale(scale, ROUND_HALF_UP));
    }

    public static void main(String[] args) {

    }
}
