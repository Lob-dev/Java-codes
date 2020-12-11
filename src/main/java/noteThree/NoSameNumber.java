package noteThree;

import noteTwo.DTO;

import java.util.*;

public class NoSameNumber {
    public static void main(String[] args) {

        NoSameNumber noSameNumber = new NoSameNumber();


        System.out.println(Arrays.toString(noSameNumber.solutions(new int[]{1, 1, 3, 3, 0, 1, 1})));
        System.out.println(Arrays.toString(noSameNumber.solutions(new int[]{4, 4, 4, 3, 3, 1, 1})));
        System.out.println(Arrays.toString(noSameNumber.solutions(new int[]{5, 8, 8, 7, 7, 6, 6, 5, 5, 4})));
        System.out.println();
        System.out.println();
        System.out.println(noSameNumber.solution(10));
        System.out.println(noSameNumber.solution(5));


    }
/*
    public int[] solution(int[] arr){

        Set<Integer> linkedHashSet = new LinkedHashSet<Integer>();

        for (int loopCount = 0; loopCount < arr.length; loopCount++) {
            linkedHashSet.add(arr[loopCount]);
        }

        Object[] objects = linkedHashSet.toArray();
        int[] result = new int[objects.length];

        for (int loopCount = 0; loopCount < objects.length; loopCount++) {
            result[loopCount] = (int) objects[loopCount];
        }

        return result;
    }

*/  public int[] solutions(int[] arr){

        List<Integer> list = new ArrayList<>();

        int check = 10;
        for (int loopCount = 0; loopCount < arr.length; loopCount++) {
            if (check != arr[loopCount]){
                list.add(arr[loopCount]);
                check = arr[loopCount];
            }

        }

        int[] result = new int[list.size()];
        for (int loopCount = 0; loopCount < result.length; loopCount++) {
            result[loopCount] = list.get(loopCount);
        }

        return result;
    }

    public int solution(int n) {
        //에라토스테네스의 체
        boolean[] prime = new boolean[n+1];

        prime[0] = prime[1] = true;

        // 2 2 = 4  , 3 3 = 9
        // 0 1 4 9 - false
        for(int i=2; i*i<=n; i++){
            if(!prime[i]){ // false 라면 = 배수 라면
                // 소수가 아님으로 표시.
                for(int j=i*i; j<=n; j+=i){
                    prime[j] = true;
                }
            }
        }

        int count = 0;

        for(int i=1; i<=n;i++){
            // false 는 소수
            if(!prime[i]){
                ++count;
            }
        }

        return count;
    }
}
