package notefive;

import java.util.Scanner;

public class Star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        for (int colLoop = 0; colLoop < col; colLoop++){
            printRow(row);
        }
    }

    private static void printRow(int row) {
        for (int rowLoop = 0; rowLoop < row; rowLoop++){
            System.out.print("*");
        }
        System.out.println();
    }


}
