import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiagonalDifference {

    public static int diagonalDifference(List<List<Integer>> arr) {
        int firstDiagonal = 0, secondDiagonal = 0;
        int j = arr.size() - 1;
        for (int i = 0; i < arr.size(); i++) {
            firstDiagonal += arr.get(i).get(i);
            secondDiagonal += (arr.get(i).get(j--));
        }
        return Math.abs(firstDiagonal - secondDiagonal);
    }

    public static void main(String[] args) {
        List<List<Integer>> numbers =new ArrayList<>();
        numbers.add(Arrays.asList(1,2,3));
        numbers.add(Arrays.asList(4,5,6));
        numbers.add(Arrays.asList(9,8,9));
        int result = diagonalDifference(numbers);
        System.out.println(result);
    }
}
