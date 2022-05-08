import java.util.ArrayList;
import java.util.List;

public class AppleAndOrange {

    public static List<Integer> calculateArr(List<Integer> arr, int treeDistance) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            result.add( treeDistance + arr.get(i) );
        }
        return result;
    }

    public static int countFruitNearOfHouse(List<Integer> arr, int s, int t) {
        int countFruit = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) >= s && arr.get(i) <= t)
                countFruit++;
        }
        return countFruit;
    }

    public static void countApplesAndOranges(
        int s, int t, int a, int b,
        List<Integer> apples, List<Integer> oranges) {
        List<Integer> applesDistances = calculateArr(apples, a);
        List<Integer> orangesDistances = calculateArr(oranges, b);
        int countApples = countFruitNearOfHouse(applesDistances, s, t);
        int countOranges = countFruitNearOfHouse(orangesDistances, s, t);
        System.out.println(countApples);
        System.out.println(countOranges);
    }

    public static void main(String[] args) {
        List<Integer> apples = new ArrayList<>();
        apples.add(2);
        apples.add(3);
        apples.add(-4);
        List<Integer> oranges = new ArrayList<>();
        oranges.add(3);
        oranges.add(-2);
        oranges.add(-4);
        countApplesAndOranges(7, 10, 4, 12, apples, oranges);
    }
}
