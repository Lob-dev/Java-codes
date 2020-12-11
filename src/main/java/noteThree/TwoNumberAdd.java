package noteThree;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoNumberAdd {
    public static void main(String[] args) {
        TwoNumberAdd twoNumberAdd = new TwoNumberAdd();
        System.out.println(twoNumberAdd.solution(3, 5));
        System.out.println(twoNumberAdd.solution(3, 3));
        System.out.println(twoNumberAdd.solution(5, 3));
        System.out.println();
        System.out.println();
        System.out.println(Arrays.toString(twoNumberAdd.solution2(new int[]{5, 9, 7, 10}, 5)));
        System.out.println(Arrays.toString(twoNumberAdd.solution2(new int[]{2, 36, 1, 3}, 1)));
        System.out.println(Arrays.toString(twoNumberAdd.solution2(new int[]{3, 2, 6}, 10)));
    }

    public long solution(int a, int b) {
        long answer = 0;

        if(a > b){
            for (int index = a; index >= b; index--){
                answer += index;
            }
        }
        for (int index = a; index <= b; index++){
            answer += index;
        }

        return answer;
    }

    public int[] solution2(int[] arr, int divisor) {

        int count = 0;
        ArrayList<Integer> answer = new ArrayList<>();

        for (int loopCount = 0; loopCount < arr.length; loopCount++) {
            if (arr[loopCount] % divisor == 0){
                answer.add(arr[loopCount]);
            }
        }
        if (answer.size() == 0){ return new int[] {-1}; }

        int[] resArr = answer.stream().mapToInt(i -> i).toArray();
        Arrays.sort(resArr);
        return resArr;
    }

    public int[] solution3(int[] arr, int divisor) {
        return Arrays.stream(arr).filter(factor -> factor % divisor == 0).toArray();
    }
}
