package notesix;

import java.util.*;

public class RemoveInPairs {

    public static void main(String[] args) {
        System.out.println(solution("baabaa"));
        System.out.println(solution("cdcd"));
    }

    // baabaa // bbaa // aa //

    // cdcd //

    public static int solution(String s) {
        Stack<String> stack = new Stack<>();

        for (int loop = 0; loop < s.length(); loop++) {
            char c = s.charAt(loop);
            if (!stack.isEmpty() && stack.peek().equals(String.valueOf(c))){
                stack.pop();
            } else {
                stack.push(String.valueOf(c));
            }
        }

        if (stack.empty()){
            return 1;
        }

        return 0;
    }
}
