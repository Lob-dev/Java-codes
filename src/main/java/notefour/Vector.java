package notefour;

public class Vector {

    public static void main(String[] args) {

        Vector vector = new Vector();
        System.out.println(vector.solution(new int[] {1,2,3,4}, new int[] {-3,-1,0,2}));

    }

    public int solution(int[] a, int[] b){
        int answer = 1234567890;
        int tmp = 0;
        for (int loop = 0; loop < a.length; loop++) {
            int i = a[loop];
            int j = b[loop];

            tmp += i * j;
        }
        answer = tmp;
        return answer;
    }
}
