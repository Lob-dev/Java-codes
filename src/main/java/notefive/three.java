package notefive;

public class three {

    public static void main(String[] args) {
        String str = "YES";

        System.out.println();

        solution(45);
    }

    public static int solution(int n) {
        int answer = 0;
        StringBuilder str = new StringBuilder();

        while (n != 0){
            str.append(n % 3);
            System.out.println(str);
            n = n/3;
        }

        str = str.reverse();
        System.out.println(str);
        for (int loop = 0; loop < str.length(); loop++) {
            answer += Character.getNumericValue(str.charAt(loop)) * Math.pow(3, loop);
        }

        return answer;
    }

}
