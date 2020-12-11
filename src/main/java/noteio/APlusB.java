package noteio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class APlusB {
    public static void main(String[] args) throws IOException {
        String[] paramStr = new BufferedReader(new InputStreamReader(System.in)).readLine().split(" ");

        int numA = Integer.parseInt(paramStr[0]);
        int numB = Integer.parseInt(paramStr[1]);

        System.out.println(numA + numB);

        Integer numC = Integer.valueOf("10");

        System.out.println(numC + numA);

    }
}
