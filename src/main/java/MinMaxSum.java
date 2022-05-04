import java.util.ArrayList;
import java.util.List;

public class MinMaxSum {

    public static void miniMaxSum(List<Integer> arr) {
        long min = arr.get(0), max = min, sum = min;
        for (int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
            if (arr.get(i) < min) min = arr.get(i);
            if (arr.get(i) > max) max = arr.get(i);
        }
        long minSum = sum - max;
        long maxSum = sum - min;
        System.out.printf("%s %s", minSum, maxSum);
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        miniMaxSum(list);
    }
}
