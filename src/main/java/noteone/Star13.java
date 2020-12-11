package noteone;

import java.util.Scanner;

public class Star13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int loop = scanner.nextInt();

        for(int i = 0; i < loop; i++){
            for (int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = loop-1; i >= 0; i--){
            for (int j = i; j > 0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
