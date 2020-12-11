package notefive;

import java.util.Arrays;

public class DoubleArraySum {

    public static void main(String[] args) {
        DoubleArraySum doubleArraySum = new DoubleArraySum();
        System.out.println(Arrays.deepToString(doubleArraySum.solution(new int[][]{{1, 2}, {2, 3}}, new int[][]{{3, 4}, {5, 6}})));
        System.out.println(Arrays.deepToString(doubleArraySum.solution(new int[][]{{1}, {2}}, new int[][]{{3}, {4}})));
    }

    // [1,2] [2,3]
    //  0 1   0 1  +
    // [3,4] [5,6]

    // arr1[0][0] arr2[0][0]  //  arr1[1][1] arr2[1][1]
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];

        for (int loop = 0; loop < arr1.length; loop++) {
            for (int innerLoop = 0; innerLoop < arr1[0].length; innerLoop++) {
                answer[loop][innerLoop] = arr1[loop][innerLoop] + arr2[loop][innerLoop];
            }
        }

        return answer;
    }
}
