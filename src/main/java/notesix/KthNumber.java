package notesix;

import java.util.Arrays;

public class KthNumber {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(12345)));
    }

    public static int[] solution(long n) {
        String[] split = Long.toString(n).split("");
        int[] answer = new int[split.length];

        for (int loop = split.length-1; loop >= 0; loop--) {
            answer[loop] = Integer.parseInt(split[loop]);
        }

        return answer;
    }
}
