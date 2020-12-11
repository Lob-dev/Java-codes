package noteTwo;

import java.util.Arrays;

public class wanju {

    public static void main(String[] args) {

        wanju wanju = new wanju();
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"kiki", "eden"};

        String res = wanju.solution(participant, completion);
        System.out.println("res = " + res);

    }

    public String solution(String[] participant, String[] completion) {

        Arrays.sort(participant);
        Arrays.sort(completion);

        int idx;
        for (idx=0; idx < completion.length; idx++){
            if(!participant[idx].equals(completion[idx])){
                return participant[idx];
            }
        }
        return participant[idx];
    }
}
