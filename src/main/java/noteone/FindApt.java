package noteone;

import java.util.Scanner;

public class FindApt {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] res = new int[26];
        String str = scanner.nextLine();

        for (int idx=0; idx<str.length(); idx++) {
            res[str.charAt(idx)-'a']++;
        }

        for (int idx = 0; idx<res.length; idx++){
            System.out.print(res[idx]);
            System.out.print(" ");
        }
    }
}
