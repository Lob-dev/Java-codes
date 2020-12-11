package noteone;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FindNumberCount {
    public static void main(String[] args) throws IOException {
        // 첫번째 입력은 정수의 숫자
        // 두번째 입력은 1개씩 정수 입력
        // 세번째 입력은 찾을 값
        Scanner scanner = new Scanner(System.in);

        int len = scanner.nextInt();

        ArrayList<Integer> integerList = new ArrayList<>();

        for (int idx = 0; idx < len; idx++){
            integerList.add(scanner.nextInt());
        }
        System.out.println("integerList = " + integerList);

        int findNum = scanner.nextInt();
        int resCount = 0;

        for (int num : integerList){
            if(num == findNum){
                ++resCount;
            }
        }
        System.out.println("resCount = " + resCount);

    }
}
