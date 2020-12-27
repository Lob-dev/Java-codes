package notesix;

import java.util.*;

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

        // 스테이지 단계 수만큼 순회
        for (int stageNum = 1; stageNum < N+1; stageNum++) {
            int challenger = 0;
            int totalUsers = 0;

            // 유저의 수 만큼 순회
            for (int userStage : stages) {
                if (stageNum <= userStage) {
                    // 현재 단계보다 해당 User 의 단계가 높다면 클리어
                    ++totalUsers;
                }
                if (stageNum == userStage) {
                    // 현재 단계와 해당 User 의 단계가 같으면 미클리어
                    ++challenger;
                }
            }
            
            // 해당 스테이지를 클리어한 사람이 없다면
            if (totalUsers == 0) {
                infoList.add(new FailInfo(stageNum, 0D));
            } else {
            // 해당 스테이지를 클리어한 사람이 있다면 도전자와 실패율 계산    
                infoList.add(new FailInfo(stageNum, ((double) challenger/totalUsers) ));
            }

        }
        
        // 메서드 참조를 통해 해당 객체의 Comparable 구현 메서드를 호출
        infoList.sort(FailInfo::compareTo);
        
        // 스트림을 통한 배열 변환
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
