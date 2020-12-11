package notefour;

public class SuBak {
    public static void main(String[] args) {
        SuBak suBak = new SuBak();
        System.out.println(suBak.solution(3));
        System.out.println(suBak.solution(4));
    }

    public String solution(int n) {
        StringBuilder answer = new StringBuilder();

        for (int i=0; i<n; i++){
            if (i % 2 == 0){
                answer.append("수");
            } else {
                answer.append("박");
            }
        }

        return answer.toString();
    }
}
