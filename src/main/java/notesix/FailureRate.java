package notesix;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

// 아직 못풀었..
public class FailureRate {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(5, new int[]{2,1,2,6,2,4,3,3})));
        //System.out.println(Arrays.toString(solution(4, new int[]{4,4,4,4,4})));
    }

    // 2 1 2 6 2 4 3 3 = 도전 중인 스테이지 번호
    // 1 0 1 5 1 3 2 2 = 완료한 스테이지 번호
    // 실패율은 아직 클리어하지 못한 플레이어의 수 / 스테이지에 도달한 플레이어 수

    // 1/8  1
    // 3/7  2
    // 2/4  3
    // 1/2  4
    // 0/1  5
    // 실패율이 같은 스테이지가 있다면 작은 번호의 스테이지가 먼저 온다.
    // 통과하면 N+1, 하지못하면 N
    public static int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        double totalUsers = 0;
        double challenger = 0;
        FailInfo[] rate = new FailInfo[N];

        int index = 200000000;
        for (int i = 0; i < stages.length; i++) {
            if (stages[i] < index) {
                index = stages[i];
            }
        }

        for (int loop = index; loop < N+1; loop++) {
            for (int stage : stages) {
                if (loop-1 < stage) {
                    totalUsers+=1;
                }
                if (loop == stage) {
                    challenger+=1;
                }
            }
            rate[loop-1] = new FailInfo(loop, (challenger/totalUsers) );
            System.out.println(loop-1);
            totalUsers = 0;
            challenger = 0;
        }

        System.out.println(Arrays.toString(rate));
        return answer;
    }

    private static class FailInfo{
        private int stage;
        private double rate;

        private FailInfo(int stage, Double rate){
            this.stage = stage;
            this.rate = rate;
        }

        public int getIndex() {
            return stage;
        }

        public Double getRate() {
            return rate;
        }
    }

}
