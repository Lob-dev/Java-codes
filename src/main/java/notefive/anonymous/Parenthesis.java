package notefive.anonymous;

import java.util.*;

public class Parenthesis {

    public static void main(String[] args) {
/*
        Scanner scanner = new Scanner(System.in);
        int loop = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < loop; i++) {
            String[] split = scanner.nextLine().split("");
            check(split);
        }
*/

        System.out.println(check2("()()"));
        System.out.println(check2("(())()"));
        System.out.println(check2(")()("));
        System.out.println(check2("(()("));
    }
    public static void check(String[] split){
        long count = 0;

        for (int index = 0; index < split.length; index++) {
            if (split[index].equals("(")){
                ++count;
            } else if (split[index].equals(")")) {
                --count;
            }
        }

        if (count == 0) {
            System.out.println("");
        } else {
            System.out.println("NO");
        }
    }

    // 올바른 괄호
    public static boolean check2(String s){
        Stack<Character> stack = new Stack<>();

        if (s.charAt(0) == ')'){
            return false;
        }

        for (int index = 0; index < s.length(); index++) {
            if (s.charAt(index) == '(') {
                stack.push('(');
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else if (s.charAt(index) == ')' && !stack.pop().equals('(')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
