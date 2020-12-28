package notesix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StockPrice {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 2, 3})));
    }

    public static int[] solution(int[] prices) {
        List<Integer> answer = new ArrayList<>();
        int[] array = new int[prices.length];
        int count = 0;

        for (int loop = 0; loop < prices.length; loop++) {
            for (int loops = loop; loops < prices.length - 1; loops++) {
                if (prices[loop] > prices[loops]) {
                    break;
                } else {
                    count += 1;
                }
            }
            answer.add(count);
            count = 0;
        }

        for (int loop = 0; loop < prices.length; loop++) {
            array[loop] = answer.get(loop);
        }
        return array;
    }
}
