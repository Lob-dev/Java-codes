package noteTwo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AgeGap {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        var loopCount = scanner.nextInt();


        var max =- 2147000000;
        var min = 2147000000;
        var result = 0;

        for (int index = 0; index < loopCount; index++) {
            var value= scanner.nextInt();
            if (max < value){ max = value; }
            if (min > value){ min = value; }
        }
        System.out.println(max - min);


        
        
        
        
        
    }    
}
