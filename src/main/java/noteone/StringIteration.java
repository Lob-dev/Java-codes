package noteone;

import jdk.swing.interop.SwingInterOpUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringIteration {

    public static void main(String[] args) throws IOException {

        // 2 = 2번 반복 for
        // 3 ABC = ABC의 각 문자를 3번 반복해서 생성해라
        // 5 /HTP = 위와 동
/*
        Scanner scanner = new Scanner(System.in);

        int idx = scanner.nextInt();
        for (int i = 0; i < idx; i++){

            int r = scanner.nextInt();
            String s = scanner.next();

            for(int j = 0; j < s.length(); j++) {
                for(int k = 0; k < r; k++) {
                    System.out.print(s.charAt(j));
                }
            }

        }
*/


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int Count = Integer.parseInt(br.readLine());

        for(int iterLoop = 0; iterLoop < Count; iterLoop++) {

            String[] IterStrings = br.readLine().split(" ");

            int IterCount = Integer.parseInt(IterStrings[0]); // Iteration count
            String iterString = IterStrings[1];               // Iteration String

            for(int IterStringIdx = 0; IterStringIdx < iterString.length(); IterStringIdx++) {
                for(int IterLoopCount = 0; IterLoopCount < IterCount; IterLoopCount++) {
                    // 문자열의 각 문자마다 IterCount 횟수 만큼 반복해서 출력.
                    System.out.print(iterString.charAt(IterStringIdx));
                }
            }
            System.out.println();
        }

    }


}
