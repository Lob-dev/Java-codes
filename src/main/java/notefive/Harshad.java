package notefive;

import java.util.Arrays;

public class Harshad {

    public static void main(String[] args) {
        Harshad harshad = new Harshad();
        System.out.println(harshad.solution(10));
        System.out.println(harshad.solution(12));
        System.out.println(harshad.solution(11));
        System.out.println(harshad.solution(13));
    }

    public boolean solution(int x) {

        String[] split = Integer.toString(x).split("");

        int sum = 0;
        for (String s : split) {
            sum += Integer.parseInt(s);
        }

        if (x % sum == 0) {
            return true;
        }

        return false;
    }


}
