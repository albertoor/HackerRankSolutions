import java.util.List;

public class SimpleArrSum {
    public static int simpleArraySum(List<Integer> ar) {
        int total = 0;
        for (Integer number: ar)
            total += number;
        return total;
    }
}
