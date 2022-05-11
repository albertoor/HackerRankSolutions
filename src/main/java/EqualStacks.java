import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class EqualStacks {

    public static Stack<Integer> getStackHeight(List<Integer> h) {
        Stack<Integer> stack = new Stack<>();
        for (int i = h.size() - 1; i >= 0; i--) {
            if (stack.isEmpty()) stack.push(h.get(i));
            else stack.push(h.get(i) + stack.peek());
        }
        return stack;
    }


    public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
        Stack<Integer> stack1 = getStackHeight(h1);
        Stack<Integer> stack2 = getStackHeight(h2);
        Stack<Integer> stack3 = getStackHeight(h3);
        int stack1Height;
        int stack2Height;
        int stack3Height;
        int height = 0;

        while (!stack1.isEmpty() && !stack2.isEmpty() && !stack3.isEmpty()) {
            stack1Height = stack1.peek();
            stack2Height = stack2.peek();
            stack3Height = stack3.peek();

            if(stack1Height == stack2Height && stack2Height == stack3Height)
                return stack1.peek();

            if(stack1Height > stack2Height || stack1Height > stack3Height)
                height = stack1.pop();
            else if(stack2Height > stack1Height || stack2Height > stack3Height)
                height = stack2.pop();
            else if(stack3Height > stack1Height || stack1Height > stack2Height)
                height = stack3.pop();
        }

        return height;
    }

    public static void main(String[] args) {
        /*
            h1  h2  h3
            3   4   1
            2   3   1
            1   2   4
            1       1
            1
         */
        //[3, 2, 1, 1, 1]
        List<Integer> list1 = new ArrayList<>();
        list1.add(3);
        list1.add(2);
        list1.add(1);
        list1.add(1);
        list1.add(1);

        // [4, 3, 2]
        List<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(3);
        list2.add(2);

        // [1, 1, 4, 1]
        List<Integer> list3 = new ArrayList<>();
        list3.add(1);
        list3.add(1);
        list3.add(4);
        list3.add(1);

        System.out.println(equalStacks(list1, list2, list3));
    }
}
