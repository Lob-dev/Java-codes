package noteThree;

import java.util.Arrays;
import java.util.StringJoiner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EnglishReplace {
    public static void main(String[] args) {
        System.out.println(replacer2("bE     au T I fu L"));
        System.out.println(replacer3("bE     au T I fu L"));
        System.out.println(replacer2("He lL O W    O rld !"));
        System.out.println(replacer3("He lL O W    O rld !"));
    }

    public static String replacer(String str){
        return str.replace(" ", "").toLowerCase();
    }

    public static String replacer2(String str){
        return Arrays.stream(str.split(" "))
                .filter((s) -> !s.trim().equals(""))
                .map(String::toLowerCase)
                .collect(Collectors.joining());
    }

    public static String replacer3(String str){
        return Arrays.stream(str.split(" "))
                .map(String::trim)
                .filter((s) -> !s.equals(""))
                .map(String::toLowerCase)
                .collect(Collectors.joining());
    }

}
