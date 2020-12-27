package notesix;

import java.util.Arrays;

public class XNumberNList {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(5, 5)));
    }

    public static long[] solution(int x, int n) {
        long[] answer = new long[n];

        long num = 0;
        for (int loop = 0; loop < n; loop++) {
            num += x;
            answer[loop] = num;
        }

        return answer;
    }
}
