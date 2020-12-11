package noteTwo;

import java.util.Scanner;

public class DivedeN {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        var number = scanner.nextInt();
        int result = 0;

        System.out.print("1");
        for (int i = 2; i < number; i++) {
            if (number % i == 0){
                result += i;
                System.out.print("+"+i);
            }
        }
        result++;
        System.out.print("=" + result);
    }


}
