package notefive.anonymous;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Anagram {

    public static void main(String[] args) {
        System.out.println(solution("AbaAeCe", "baeeACA"));
        System.out.println(solution("AbaedCe", "baeeACA"));
    }

    public static String solution(String anagram, String anagram2) {
        String[] split = anagram.split("");
        String[] split2 = anagram2.split("");

        List<String> list = new ArrayList<>();

        list.addAll(Arrays.asList(split));

        for (String s : split2) {
            list.remove(s);
        }

        if (list.size() == 0){
            return "YES";
        }else {
            return "NO";
        }
    }
}
