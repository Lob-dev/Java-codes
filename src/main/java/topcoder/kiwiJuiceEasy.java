package topcoder;

import java.util.Arrays;

public class kiwiJuiceEasy {
    public static void main(String[] args) {

        kiwiJuiceEasy kiwiJuiceEasy = new kiwiJuiceEasy();

        System.out.println(Arrays.toString(kiwiJuiceEasy.juice(new int[]{20, 20}, new int[]{8, 5}, new int[]{0}, new int[]{1})));
        System.out.println(Arrays.toString(kiwiJuiceEasy.juice(new int[]{10, 10}, new int[]{5, 8}, new int[]{0}, new int[]{1})));
        System.out.println(Arrays.toString(kiwiJuiceEasy.juice(new int[]{30, 20, 10}, new int[]{10, 5, 5}, new int[]{0,1,2}, new int[]{1,2,0})));
        System.out.println(Arrays.toString(kiwiJuiceEasy.juice(new int[]{14, 35, 86, 58, 25, 62}, new int[]{6, 34, 27, 38, 9, 60}, new int[]{1,2,4,5,3,3,1,0}, new int[]{0,1,2,4,2,5,3,1})));
    }

    private int[] juice(int[] capacities, int[] bottles, int[] fromId, int[] toId){
        //20 20
        //8  5
        //0  1
        //0->13

        for (int loop=0; loop < fromId.length; loop++){
            int from = fromId[loop];
            int to = toId[loop];

            // 현재 남은 용량 = 총 용량 - 현재 가진 량
            int capacity = capacities[to] - bottles[to];

            // 넘겨줘야 할 병의 용량 , 넘겨 받아야할 병의 용량 - 현재 용량
            // 20 , 20 - 8
            // 20 , 12
            // tmp = 12;

            // lock free , wait free

            // sum = 넘겨줄 병의 현재 용량 + 넘겨받을 병의 현재 용량
            int sum = bottles[fromId[loop]] + bottles[toId[loop]];

            // 넘겨받을 병의 용량 = 현재 2병의 총 용량 or toId 의 총 용량
            // 현재 2병의 총 용량이 capacity 를 넘는다면 용량 만큼 넣고 그렇지 않다면 sum 을 넣으면 된다.
            bottles[toId[loop]] = Math.min(sum, capacities[toId[loop]]);

            // 넘겨준 병의 용량 = 현재 2병의 총 용량 - 넘겨 받은 병의 현재 용량
            bottles[fromId[loop]] = sum - bottles[toId[loop]];


            /* 2번 로직
            int tmp = Math.min(bottles[from], capacities[to] - bottles[to]);

            bottles[from] -= tmp;
            bottles[to] += tmp;
            */

            /* 1번 로직
            int tmp = 0;

            if (capacity >= bottles[from]){
                tmp = bottles[from]; // 내부 용량 저장
                bottles[to] += tmp; // 합치기
                bottles[from] = 0;  // 0으로 변경
            } else if (capacity <= bottles[from]){
                tmp = capacity; // 용량을 값에 저장
                bottles[to] += capacity; // 용량을 저장하고
                bottles[from] -= tmp;    // 용량 - from 내부 용량
            }
            */


        }


        return bottles;
    }

}
