package notefive;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class SecretMap {

    public static void main(String[] args) {
        SecretMap secretMap = new SecretMap();
        System.out.println(Arrays.toString(secretMap.solution(5, new int[]{9, 20, 28, 18, 11}, new int[]{30, 1, 21, 17, 28})));;
        System.out.println(Arrays.toString(secretMap.solution(5, new int[]{46, 33, 33 ,22, 31, 50}, new int[]{27 ,56, 19, 14, 14, 10})));;
    }

    public String[] solution(int n, int[] arr1, int[] arr2) {

        String[] answer = new String[n];

        for (int loop = 0; loop < n; loop++) {
            String replace = Integer.toBinaryString(arr1[loop] |= arr2[loop]);
            replace = String.format("%" + n + "s", replace);
            replace = replace.replaceAll("1","#");
            answer[loop] = replace.replaceAll("0"," ");
        }

        return answer;
    }
}
