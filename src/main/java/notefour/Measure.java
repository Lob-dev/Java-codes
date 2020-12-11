package notefour;

public class Measure {
    public static void main(String[] args) {
        Measure measure = new Measure();

        System.out.println(measure.solution(12));
        System.out.println(measure.solution(5));
        System.out.println(measure.solution1(123));
        System.out.println(measure.solution1(987));

    }

    public int solution(int n) {
        int answer = 0;

        for (int loop=1; loop <= n; loop++){
            if ((n % loop) == 0){
                answer += loop;
            }
        }
        return answer;
    }

    public int solution1(int n) {
        int answer = 0;

        int tmp = 0;

        for (int loop = 0; loop < n; n=n/10) {
            tmp = n%10;
            answer += tmp;
        }

        return answer;
    }
}
