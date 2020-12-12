package notesix;

import java.util.Arrays;
import java.util.Collections;


public class KthNumber {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(12345)));
        System.out.println(Arrays.toString(solution2(12345)));
        System.out.println(Arrays.toString(solution3(12345)));
        System.out.println(Arrays.toString(solution4(12345)));
    }

    // 풀이 1
    public static int[] solution(long n) {
        String[] split = Long.toString(n).split("");
        int[] answer = new int[split.length];

        Collections.reverse(Arrays.asList(split));

        for (int loop = 0; loop < split.length; loop++) {
            answer[loop] = Integer.parseInt(split[loop]);
        }

        return answer;
    }

    // 풀이 2
    public static int[] solution2(long n) {
        String str = Long.toString(n);
        int[] answer = new int[str.length()];

        for (int index = 0; index < str.length(); index++) {
            answer[index] = Integer.parseInt(String.valueOf(str.charAt(index)));
        }

        // 삽입 정렬 사용.
        int target;
        for (int loop = 0; loop < answer.length - 1; loop++) {
            target = loop; // 0, 1, 2, 3, 4, 5

            for (int index = loop+1; index < answer.length; index++) {
                // target 보다 큰 값을 계속 탐색 = 계속 덮어쓴다. (내림차순 정렬)
                // 해당 로직만 변경하면 오름차순 target 보다 작은 값을 계속 탐색 = answer[target] > answer[index]
                if (answer[target] < answer[index]){ target = index; }
                // answer[0...N-1]< answer[1...N]

                // loop = 0;
                // 0  <  1...N
                // 1  <  2...N
                // 2  <  3...N
                // 3  <  4...N
            }

            // 자기 자신이 아니라면 True
            if (loop != target){
                int temp = answer[loop];
                answer[loop] = answer[target];
                answer[target] = temp;
            }
        }

        return answer;
    }

    // 풀이 3
    public static int[] solution3(long number) {
        String len = number+"";
        int[] answer = new int[len.length()];

        int count=0;
        while(number!=0) {
            answer[count]=(int)(number%10);
            number/=10;
            ++count;
        }

        return answer;
    }

    // 다른 사람 풀이
    public static int[] solution4(long n) {
        String s = String.valueOf(n);

        StringBuilder stringBuilder = new StringBuilder(s);
        stringBuilder = stringBuilder.reverse();

        String[] split = stringBuilder.toString().split("");

        int[] answer = new int[split.length];
        for (int loop = 0; loop < answer.length; loop++) {
            answer[loop] = Integer.parseInt(split[loop]);
        }

        return answer;
    }
}
