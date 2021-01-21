package notesix;

import java.util.Arrays;

public class budget {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 3, 2, 5, 4}, 9));
        System.out.println(solution(new int[]{2, 2, 3, 3}, 10));
    }

    public static int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        for (int i : d) {
            if (i <= budget) {
                budget -= i;
                ++answer;
            }
        }
        return answer;
    }
}
