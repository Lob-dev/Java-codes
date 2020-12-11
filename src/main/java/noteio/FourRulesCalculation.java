package noteio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FourRulesCalculation {
    public static void main(String[] args) throws IOException {

        int numA = 10;
        int numB = 10;

        System.out.println(numA + numB); // 20

        int i = numA + numB;
        System.out.println(i);

        int j = numA - numB;
        System.out.println(j);

        System.out.println(numA - numB);

        int k = numA / numB;
        System.out.println("i1 = " + k);

        System.out.println(numA / numB);

        numA = 11;
        numB = 2;

        System.out.println(numA%numB);


        String strA = "hello";
        strA += " World";
        System.out.println(strA);
        System.out.println(strA+"!");

        String strB = "hellos";


        long numC = 10L;
        int numD = 10;

        System.out.println(numC+numD);


        double numE = 10.0;

        System.out.println(numC+numE);
        System.out.println(numC-numE);

        System.out.println();
        System.out.println();



    }
}
