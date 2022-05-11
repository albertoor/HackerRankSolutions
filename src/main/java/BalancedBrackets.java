import java.util.Stack;

public class BalancedBrackets {

    public static String isBalanced(String s) {
        Stack<Character> stack = new Stack();
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (current == '(' || current == '{' || current == '[')
                stack.push(current);
            else{
                if (stack.isEmpty())
                    return "NO";
                else{
                    char popBracket = stack.pop();
                    if (current == ')' && popBracket != '(')
                        return "NO";
                    else if (current == '}' && popBracket != '{')
                        return "NO";
                    else if (current == ']' && popBracket != '[')
                        return "NO";
                }
            }
        }

        if (stack.isEmpty()) return "YES";
        else return "NO";
    }


    public static void main(String[] args) {
        //String s = "{[(])}";
        String s = "{(([])[])[]]}";
        String result = isBalanced(s);
        System.out.println(result);
    }
}
