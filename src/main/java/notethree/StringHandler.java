package notethree;

import java.util.*;

public class StringHandler {
    public static void main(String[] args) {
        StringHandler stringHandler = new StringHandler();

        System.out.println(stringHandler.solution("a234"));
        System.out.println(stringHandler.solution("1234"));
        System.out.println();
        System.out.println(Arrays.toString(stringHandler.solution2(new String[]{"sun", "bed", "car"}, 1)));
        System.out.println();
        System.out.println(stringHandler.solution4("Zbcdefg"));

    }

    public boolean solution(String s) {
        boolean answer = true;
        int len = s.length();

        if (len == 4 || len == 6){
            for (int loopCount = 0; loopCount < len; loopCount++) {
                if (Character.isAlphabetic(s.charAt(loopCount))){
                    answer = false;
                }
            }
        }else{
            answer = false;
        }
        return answer;
    }

    public String[] solution2(String[] strings, int n) {

        Arrays.sort(strings, (s1, s2) -> {
            return s1.charAt(n) - s2.charAt(n) != 0 // 인덱스의 문자열이 같지 않으면
                    ? s1.charAt(n) - s2.charAt(n)   // 문자 간의 뺀 값을 기준으로 정렬하고
                    : s1.compareTo(s2);             // 같으면 대소관계의 사전순 정렬
        });

        return strings;
    }

    public String solution3(String strings) {
        return String.valueOf(new StringBuilder(strings).reverse());
    }

    public String solution4(String strings) {

        String[] str = strings.split("");

        Arrays.sort(str, Collections.reverseOrder());

        return String.join("",str);
    }
}
