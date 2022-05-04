import java.util.ArrayList;
import java.util.List;

public class AVeryBigSum {

    public static long aVeryBigSum(List<Long> ar) {
        long total = 0;
        for (Long number: ar) {
            total += number;
        }
        return total;
    }

    public static void main(String[] args) {
        List<Long> numbers = new ArrayList<>();
        numbers.add(1000000001L);
        numbers.add(1000000002L);
        numbers.add(1000000003L);
        numbers.add(1000000004L);
        numbers.add(1000000005L);
        Long result = aVeryBigSum(numbers);
        System.out.println(result);
    }
}
