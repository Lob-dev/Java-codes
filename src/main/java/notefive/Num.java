package notefive;

import javax.xml.validation.Schema;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Num {

    public static void main(String[] args) {
        int val = 4321;
        int dt4 = 0, dt3 = 0, dt2 = 0, dt1 = 0;

        dt4 = val/1000%10;
        dt3 = (val/100)%10;
        dt2 = (val/10)%10;
        dt1 = val%10;

        System.out.println("dt4 = " + dt4);
        System.out.println("dt3 = " + dt3);
        System.out.println("dt2 = " + dt2);
        System.out.println("dt1 = " + dt1);

        int a = 4;
        int a2 = 4;

        int b = 3;

        a %= b;
        a2 |= b;

        System.out.println(a);
        System.out.println(a2);

        check();
    }
    public static void check() {

        Stack<String> stack = new Stack<>();

        for (int i = 0; i < 17; i++) {
            stack.push(String.valueOf(48-(i*3)));
        }

        String s;
        boolean flag = false;

        for (int idx = 0; idx < 17; idx++) {
            s = "";
            s += stack.pop() + "시간전" + "날씨";
            System.out.println(s);
        }

    }
}
