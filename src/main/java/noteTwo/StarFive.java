package noteTwo;

import java.util.Scanner;

public class StarFive {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        var loopCount = scanner.nextInt();
/*

        for (int index = 0; index < loopCount; index++) {
            for (int loopBlank = 1; loopBlank < loopCount - index; loopBlank++){
                System.out.print(" ");
            }
            for (int loopStars = 0; loopStars < index * 2 + 1; loopStars++){
                System.out.print("*");
            }
            System.out.println();
        }

*/
        for (int index = 0; index < loopCount; loopCount++){
            System.out.print(" ".repeat(loopCount-index-1));
            System.out.print("*".repeat((index+1) * 2));
        }

    }
}
