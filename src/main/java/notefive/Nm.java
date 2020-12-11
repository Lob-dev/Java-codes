package notefive;

import java.util.Arrays;

public class Nm {

    public static void main(String[] args) {
        Nm nm = new Nm();
        System.out.println(Arrays.toString(nm.solution(3, 12)));
        System.out.println(Arrays.toString(nm.solution(2, 5)));
    }

    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        answer[0] = gcd(n,m);
        int variable = answer[0];
        answer[1] = n * m / variable;

        return answer;
    }

    static int gcd(int n, int m){
        while (m!=0){
            int v = n%m;
            n = m;
            m = v;
        }
        return n;
    }
}
