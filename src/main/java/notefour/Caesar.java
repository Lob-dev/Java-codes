package notefour;

import java.util.Arrays;

public class Caesar {

    public static void main(String[] args) {
        System.out.println(solution("AB", 1));
        System.out.println(solution("z", 1));
        System.out.println(solution("a B z", 4));
    }

    public static String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        String[] split = s.split("");
        System.out.println(Arrays.toString(split));
        char tmp;
        int parser;

        for (int loop = 0; loop < split.length; loop++) {
            tmp = split[loop].charAt(0);
            if (check(answer, tmp)){
                continue;
            }
            parser = (int) tmp;
            parser += n;
            tmp = (char) parser;
            answer.append(tmp);
        }

        return answer.toString();
    }

    private static boolean check(StringBuilder answer, char tmp) {
        if (tmp == 'z'){
            answer.append("a");
            return true;
        }else if (tmp == 'Z'){
            answer.append("A");
            return true;
        }else if (tmp == ' '){
            answer.append(' ');
            return true;
        }
        return false;
    }

}
