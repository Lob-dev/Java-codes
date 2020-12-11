package noteone;

import java.util.Scanner;

public class Star12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0, k = n; i < 2 * n; i++) {

            for(int j = 0; j < n; j++) {
                System.out.print((j < k - 1)?" ":"*");
            }
            if(i < n - 1){
                k--;
            }else{
                k++;
            }
            System.out.println();

        }

        sc.close();
    }
}
