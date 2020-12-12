package notetwo;

import java.util.ArrayList;

public class moe {
    public static void main(String[] args) {
        moe moe = new moe();
        int[] array = {1,2,3,4,5};

        int[] resArray = moe.solution(array);
    }

    public int[] solution(int[] answers) {
        int[] student1 = {1,2,3,4,5};
        int[] student2 = {2,1,2,3,2,4,2,5};
        int[] student3 = {3,3,1,1,2,2,4,4,5,5};
        ArrayList<Integer> answerList = new ArrayList<>();

        int flag1 = 0;
        int flag2 = 0;
        int flag3 = 0;


        for (int idx = 0; idx < answers.length; idx++){
            if(answers[idx] == student1[idx % 5]){
                ++flag1;
            }
            if(answers[idx] == student2[idx % 8]){
                ++flag2;
            }
            if(answers[idx] == student3[idx % 10]){
                ++flag3;
            }
        }

        int max = Math.max(Math.max(flag1, flag2),flag3);

        if(max==flag1){
            answerList.add(1);
        }else if(max==flag2){
            answerList.add(2);
        }else {
            answerList.add(3);
        }

        int[] answer = new int[answerList.size()];

        for(int i =0; i<answer.length; i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }
}
