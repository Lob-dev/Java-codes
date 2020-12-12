package notesix;

import java.util.Arrays;

public class HidingPhoneNumber {

    public static void main(String[] args) {

        System.out.println(solution("01033334444"));
        System.out.println(solution("027778888"));
        System.out.println();
        System.out.println(solution2("01033334444"));
        System.out.println(solution2("027778888"));
        System.out.println();
        System.out.println(solution3("01033334444"));
        System.out.println(solution3("027778888"));

    }

    public static String solution(String phone_number) {
        StringBuilder answer = new StringBuilder();
        int length = phone_number.length();

        for (int loop = 0; loop < phone_number.length() - 4; loop++) {
            answer.append("*");
        }

        for (int index = length-4; index < phone_number.length(); index++) {
            answer.append(phone_number.charAt(index));
        }

        return answer.toString();
    }

    public static String solution2(String phone_number) {
        StringBuilder answer = new StringBuilder();

        for (int loops = 0; loops < phone_number.length(); loops++){
            if (loops < phone_number.length() - 4) {
                answer.append("*");
            } else {
                answer.append(phone_number.charAt(loops));
            }
        }

        return answer.toString();
    }

    public static String solution3(String phone_number) {
        String[] split = phone_number.split("");

        for (int loops = 0; loops < phone_number.length() - 4; loops++){
            split[loops] = "*";
        }

        return String.join("",split);
    }

}
