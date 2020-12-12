package notethree;

import java.util.Arrays;
import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {

        System.out.println(finder(new int[]{20, 10, 35, 30, 7}));
        System.out.println(finder(new int[]{20, 10, 35, 30, 7, 5, 55}));
        System.out.println();
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        var count = Integer.parseInt(scanner.nextLine());
        System.out.println("count = " + count);

        String[] str = scanner.nextLine().split(" ");
        System.out.println("str = " + Arrays.toString(str));

        // string -> int - for
        int[] numArray = new int[str.length];
        for (int loopCount = 0; loopCount < str.length; loopCount++) {
            numArray[loopCount] = Integer.parseInt(str[loopCount]);
        }
        System.out.println("numArray = " + Arrays.toString(numArray));
        System.out.println(finder(numArray));

        // string -> int - stream
        int[] numArrayTwo = Arrays.stream(str).mapToInt(Integer::parseInt).toArray();
        System.out.println("numArrayTwo = " + Arrays.toString(numArrayTwo));
        System.out.println(finder(numArrayTwo));


    }

    public static String finder(int[] a){
        int min=200000;
        int max=-200000;

        for (int loopCount = 0; loopCount < a.length; loopCount++) {
            if(min > a[loopCount]){ min = a[loopCount]; }
            if(max < a[loopCount]){ max = a[loopCount]; }
        }

        return min +" "+ max ;
    }

}
