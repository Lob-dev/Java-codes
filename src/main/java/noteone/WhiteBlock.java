package noteone;

import java.util.Scanner;

public class WhiteBlock {
    public static void main(String[] args) {

        char[][] chess = new char[8][8];
        Scanner scanner = new Scanner(System.in);

        int flag = 0;

        for (int idx = 0; idx < 8; idx++){
            String str = scanner.nextLine();
            for (int idx2 = 0; idx2 < 8; idx2++){
                chess[idx][idx2] = str.charAt(idx2);

                if (chess[idx][idx2] == 'F' && (idx+idx2) % 2 ==0){
                    ++flag;
                }
            }
            System.out.println(flag);
            scanner.close();
        }
    }
}
