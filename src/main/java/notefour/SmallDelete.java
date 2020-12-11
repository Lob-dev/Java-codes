package notefour;

import java.util.*;

public class SmallDelete {

    public static void main(String[] args) {
        solution(new int[]{4,3,2,1});
    }

    public static int[] solution(int[] arr) {
        if (arr.length == 1){ return new int[]{-1}; }

        int min = Integer.MAX_VALUE;
        for (int loop = 0; loop < arr.length; loop++) {
            min = Math.min(min, arr[loop]);
        }

        int[] answer = new int[arr.length-1];

        int check = 0;
        int index = 0;
        for (int loop = 0; loop < arr.length; loop++) {
            if (arr[loop] == min && check == 0){
                ++check;
                continue;
            }
            answer[index] = arr[loop];
            ++index;
        }
        return answer;
    }
}


