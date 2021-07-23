import java.util.Stack;

public class BalancedParenthesis {

    private static Stack s = new Stack();
    public static void main(String[] args) {

        System.out.println(isBalanced("("));
        System.out.println(isBalanced(")"));
        System.out.println(isBalanced("()"));
        System.out.println(isBalanced("()()()(())"));
        System.out.println(isBalanced("()()())"));
        System.out.println(isBalanced("(()(()()()"));
        System.out.println(isBalanced("(()(()())"));
    }

    public static boolean isBalanced(final String stringToCheck) {
        
        if(stringToCheck.length() == 1) {
            return false;
        }

        for(int i=0;i<stringToCheck.length(); i++) {

            if (stringToCheck.charAt(i) == '(') {
                s.push(stringToCheck.charAt(i));
            } else if (stringToCheck.charAt(i) == ')'){
                if (s.isEmpty()) {
                    return false;
                } else{
                    s.pop();
                }
            }
        }
        return s.empty();
    }
}
