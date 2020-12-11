package noteio;

import java.util.ArrayList;

public class TwoNumberPlus {

    class Solution {
        public int[] solution(int[] numbers) {
            ArrayList<Integer> res = new ArrayList<>();
            // 두개의 for이 겹치지 않게 배열 순회
            for (int fIdx = 0; fIdx < numbers.length-1; fIdx++){
                for (int eIdx = fIdx+1; eIdx < numbers.length; eIdx++){
                    // 포함되어 있지 않은 값만 add
                    if(!res.contains(numbers[fIdx]+numbers[eIdx])) {
                        res.add(numbers[fIdx]+numbers[eIdx]);
                    }
                }
            }
            // list sort
            res.sort(Integer::compareTo);
            int[] answer = new int[res.size()];
            // list 값 배열에 담기
            for (int i = 0; i < res.size(); i++){
                answer[i] = res.get(i);
            }
            return answer;
        }
    }
}
