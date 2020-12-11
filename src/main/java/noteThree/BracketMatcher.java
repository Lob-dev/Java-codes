package noteThree;

import java.util.Stack;

public class BracketMatcher {

    public static void main(String[] args) {
        System.out.println(matcher("(())()))"));
        System.out.println(matcher("(())())"));
        System.out.println(matcher("()()"));
    }

    public static boolean matcher(String str){
        char tmp;
        int left,right = 0;
        Stack<Character> stack = new Stack<>();

        for (int loopCount = 0; loopCount < str.length(); loopCount++) {
            char item = str.charAt(loopCount);
            if (item == '(') {
                stack.push(item);
            }
            if (item == ')'){
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }

        return stack.isEmpty();
    }

}
