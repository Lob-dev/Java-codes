package notesix;

public class Collatz {

    public static void main(String[] args) {
        System.out.println(solution(6));
        System.out.println(solution(16));
        System.out.println(solution(626331));
    }

    public static int solution(int num) {
        int answer = 0;
        answer = getAnswer(num, answer);
        return answer;
    }

    private static int getAnswer(int num, int answer) {
        long n = num;

        while (n != 1) {
            if (answer == 500) {
                return -1;
            }

            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = (n * 3) + 1;
            }
            ++answer;
        }
        return answer;
    }
}
