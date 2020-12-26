package notesix;

import java.util.*;

// 아직 못풀었..
public class FailureRate {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(5, new int[]{2,1,2,6,2,4,3,3})));
        System.out.println(Arrays.toString(solution(4, new int[]{4,4,4,4,4})));
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
        List<FailInfo> infoList = new ArrayList<>();

        for (int loop = 1; loop < N+1; loop++) {
            int challenger = 0;
            int totalUsers = 0;

            for (int stage : stages) {
                if (loop <= stage) {
                    ++totalUsers;
                }
                if (loop == stage) {
                    ++challenger;
                }
            }

            if (totalUsers == 0) {
                infoList.add(new FailInfo(loop, 0D));
            } else {
                infoList.add(new FailInfo(loop, ((double) challenger/totalUsers) ));
            }

        }

        infoList.sort(FailInfo::compareTo);
        System.out.println(infoList);
        return infoList.stream().mapToInt(FailInfo::getIndex).toArray();
    }

    private static class FailInfo implements Comparable<FailInfo> {
        private int stage;
        private double rate;

        private FailInfo(int stage, Double rate){
            this.stage = stage;
            this.rate = rate;
        }

        public int getIndex() {
            return stage;
        }

        public double getRate() {
            return rate;
        }

        @Override
        public int compareTo(FailInfo o) {
            if(this.getRate() == o.getRate()){
                return Integer.compare(this.getIndex(), o.getIndex());
            }
            return -Double.compare(this.getRate(), o.getRate());
        }
    }
}
