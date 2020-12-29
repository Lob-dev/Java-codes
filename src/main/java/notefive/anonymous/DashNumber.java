package notefive.anonymous;

import java.util.Arrays;

public class DashNumber {

    public static void main(String[] args) {
        System.out.println(solution2(2018));
        System.out.println(solution2(1234));
    }

    public static int solution(int num){
        int[] dashes = {6,2,5,5,4,5,6,3,7,6};
        String[] arr = (""+num).split("");

        int answer = 0;
        for (String s : arr) {
            answer += dashes[Integer.parseInt(s) % dashes.length];
        }

        return answer;
    }

    public static int solution2(int num){
        int[] dashes = {6,2,5,5,4,5,6,3,7,6};

        return Arrays.stream((""+num).split(""))
                .mapToInt(s -> dashes[Integer.parseInt(s)])
                .sum();
    }
}
