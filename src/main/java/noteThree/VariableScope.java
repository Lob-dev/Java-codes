package noteThree;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VariableScope {



    public static void main(String[] args) {
        VariableScope variableScope = new VariableScope();
        //variableScope.min(new int[]{10,20,30,40,50});
        variableScope.someMethodA();
        variableScope.someMethodB();

        var str = "Hello world";
        assert (str instanceof String);
        System.out.println(str);

        var num = 0xa;
        var numB = 10.10D;
        System.out.println(numB+num);

        int[][] numArrB = new int[10][10];
        for (int loop = 0; loop < numArrB.length; loop++) {
            for (int innerLoop = 0; innerLoop < numArrB[loop].length; innerLoop++) {
                numArrB[loop][innerLoop] = 10;
            }
        }
        System.out.println("numArrB = " + Arrays.deepToString(numArrB));


        int[][] numArrC = new int[10][10];
        for (int loop = 0; loop < numArrB.length; loop++) {
            Arrays.fill(numArrC[loop], 10);
        }
        System.out.println("numArrC = " + Arrays.deepToString(numArrC));

    }

    public void someMethod() {

    }

    private int count = 10;
    public void someMethodA(){
        System.out.println("count = " + count);
    }

    public void someMethodB(){
        int count = 1;
        System.out.println("count = " + count);
    }


/*    public void someMethod() {
        int numberA = 0;
        {
            int numberB = 1;
            numberA += numberB;
        }
        // compiler error, number cannot be solved as a variable
        System.out.println(numberB);
        System.out.println("numberA = " + numberA);
    }

    public void min(int[] args) {
        int min = 21700000;

        for (int arg : args) {
            // int arg 는 해당 Loop 내부에서만 사용이 가능하다.
            if (min > arg) {
                min = arg;
            }
            System.out.println("arg = " + arg);
        }

        //cannot find symbol.. symbol: variable arg...
        //System.out.println("arg = " + arg);
        System.out.println("min = " + min);
    }*/


    /*

    public void someMethodA() {
        // 해당 Method 의 Bracket 내부에서만 사용이 가능하다.
        int count = 0;
        System.out.println("count = " + count);
    }

    public int someMethodB() {
        //Compile Error
        int count = 0;
        count += 1;
        return count;
    }
*/

}
