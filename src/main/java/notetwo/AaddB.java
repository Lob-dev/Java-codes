package notetwo;

import java.util.Scanner;

public class AaddB {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        var A = scanner.nextInt();
        var B = scanner.nextInt();
        var result = 0;
        for (int index = A; index <= B; index++) {
            System.out.print(index);
            result += index;

            if (index < B){ System.out.print("+"); }
            if (index == B){ System.out.print("=" + result); }
        }

    }



}
