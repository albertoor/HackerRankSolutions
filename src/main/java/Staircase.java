

public class Staircase {

    //reverse
    public static void staircase2(int n) {
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("#");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void staircase(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                //System.out.printf("i:%s j:%s: \n", i , j);
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                //System.out.printf("i:%s k:%s: \n", i , k);
                System.out.print("#");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        staircase(4);
        staircase2(4);
    }
}
