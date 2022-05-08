public class NumberLineJumps {

    public static String kangaroo(int x1, int v1, int x2, int v2) {
        String message = null;
        for (int i = 0; i <= 10000 ; i++) {
            x1 += v1;
            x2 += v2;
            if (x1 == x2) message = "YES";
            else message = "NO";
            if (message.equals("YES")) break;
        }
        return message;
    }


    public static void main(String[] args) {
//        System.out.println(kangaroo(2,1,1,2));
        System.out.println(kangaroo(0,3,4,2));
//        System.out.println(kangaroo(14,4,98,2));
//        System.out.println(kangaroo(0,2,5,3));
        //System.out.println(kangaroo(0,3,4,2));

    }
}
