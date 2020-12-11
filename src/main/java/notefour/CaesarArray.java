package notefour;

public class CaesarArray {
    public static void main(String[] args) {
        System.out.println(solution("AB", 1));
        System.out.println(solution("z", 1));
        System.out.println(solution("a B z", 4));
    }

    public static String solution(String s, int n) {

        StringBuilder answer = new StringBuilder();

        char alphabat;
        for (int loop = 0; loop < s.length(); loop++) {
            alphabat = s.charAt(loop);
            check(n, answer, alphabat);
        }
        return answer.toString();
    }

    private static void check(int n, StringBuilder answer, char alpha) {
        char caser;
        if (Character.isLowerCase(alpha)){
            caser = 'a';
            alpha = (char) (caser + (alpha + n - caser) % 26);
            answer.append(alpha);
        } else if (Character.isUpperCase(alpha)){
            caser = 'A';
            alpha = (char) (caser + (alpha + n - caser) % 26);
            answer.append(alpha);
        } else {
            answer.append(' ');
        }
    }
}
