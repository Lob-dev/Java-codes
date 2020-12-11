package notefive.anonymous;

import java.util.Arrays;

public class HIndex {

    public static void main(String[] args) {
        int solution = solution(new int[]{3, 0, 6, 1, 5});
    }

    // 3 , 0 , 6 , 1 , 5
    // n개의 논문에서 h번 이상 인용된 논문이 h편 이상이고 그외의 논문들이 h번 이하로 인용되었다면
    // 5개의 논문에서 3번 이상 인용된 논문이 3편 이상이고 그외의 논문들이 3번 이하로 인용되었다면, h의 값이
    public static int solution(int[] citations) {
        int answer = 0;

        // n - h 가 h이면 진짜 h 이다.
        // 논문의 수 - 인용 횟수 = 인용 횟수 이면 H-index
        // n - h == h == h-index
        Arrays.sort(citations);

        int count = 0;
        for (int loop = 0; loop < citations.length; loop++) {
            // h = 논문 개수 - Count (탐색)
            // 5, 4, 3, 2, 1 (논문이 N개면 모두를 포함하는 인용 횟수는 N이다)
            // h = n - loop (5,4,3,2,1)
            int h = citations.length - loop;

            // n번째 논문이 인용된 횟수보다 크거나 같다면
            // 값이 같아지는 경우에 h가 그 놈이다.
            // h < count == h  /  h <= count
            if (h <= citations[loop]){
                answer = h;
                break;
            }
        }

        return answer;
    }
}
