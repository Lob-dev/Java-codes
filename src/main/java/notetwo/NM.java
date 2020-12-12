package notetwo;

import java.io.IOException;
import java.util.Scanner;

public class NM {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        var loopCount = scanner.nextInt();
        var multiple = scanner.nextInt();
        
        if (loopCount < 2){return;}
        int result = 0;
        for (int i = 1; i <= loopCount; i++) {
            if (i % multiple == 0){
                result += i;
            }
        }
        System.out.println(result);
    }

}
