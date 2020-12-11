package notefour;

import java.util.Arrays;
import java.util.Scanner;

public class DigitSum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int s = Integer.parseInt(scanner.nextLine());

        String[] s1 = scanner.nextLine().split(" ");
        System.out.println("s1 = " + Arrays.toString(s1));

        int v;
        int m=0;

        for (String item : s1){
            v = Integer.parseInt(item);
            int digit = digit(v);
            if (m < digit){
               m = digit;
            }
        }

        System.out.println(m);

    }
    public static int digit(int i){
        int tmp = 0;
        int sum = 0;

        for(sum = 0; i > 0; i /= 10) {
            tmp = i % 10;
            sum += tmp;
        }

        return sum;
    }
}
