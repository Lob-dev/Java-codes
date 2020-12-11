package notefour;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ReverseOrderLong {

    public static void main(String[] args) {
        System.out.println(solution(118372));
    }

    public static long solution(long n) {

        String str = Long.toString(n);
        String[] split = str.split("");

        Arrays.sort(split, (o1, o2) -> o2.compareTo(o1));

        return Long.parseLong(String.join("", split));
    }
}
