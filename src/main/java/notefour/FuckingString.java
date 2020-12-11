package notefour;

public class FuckingString {
    public static void main(String[] args) {
        FuckingString fuckingString = new FuckingString();

        System.out.println(fuckingString.solution("try helio world"));
    }

    public String solution(String s) {
        String[] str = s.split("");
        StringBuilder answer = new StringBuilder();
        int cnt = 0;

        for (int loop = 0; loop < s.length(); loop++) {
            if(str[loop].equals(" ")){
                cnt = 0;
                answer.append(" ");

            }else if(cnt % 2 == 0){
                cnt++;
                answer.append(str[loop].toUpperCase());
            }else{
                cnt++;
                answer.append(str[loop].toLowerCase());
            }
        }
        return answer.toString();
    }
}
