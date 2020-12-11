package notefour;

import java.util.Arrays;
import java.util.Scanner;

public class NumberSorting1 {
    public static void main(String[] args) {

    }

    public static int[] sorting(){
        Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt();
        int[] arr = new int[i];
        int n = 0;
        for (int loop=0; loop < i; loop++){
            n = scanner.nextInt();
            arr[loop] = n;
        }

        Arrays.sort(arr);

        System.out.println();
        return arr;
    }

}
