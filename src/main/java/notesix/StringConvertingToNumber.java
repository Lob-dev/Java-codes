package notesix;

import notefive.Num;

import java.util.Arrays;

public class StringConvertingToNumber {

    public static void main(String[] args) {
        StringConvertingToNumber converter = new StringConvertingToNumber();

        System.out.println(converter.solution3("12345"));
        System.out.println(converter.solution3("1234"));
        System.out.println(converter.solution3("123"));
        System.out.println(converter.solution3("12"));
        System.out.println(converter.solution3("1"));

        System.out.println(converter.solution3("-12345"));
        System.out.println(converter.solution3("-1234"));
        System.out.println(converter.solution3("-123"));
        System.out.println(converter.solution3("-12"));
        System.out.println(converter.solution3("-1"));

        System.out.println(converter.solution3("02345"));
        System.out.println(converter.solution3("0234"));
        System.out.println(converter.solution3("023"));
        System.out.println(converter.solution3("02"));
        System.out.println(converter.solution3("0"));

        System.out.println(converter.solution3("-02345"));
        System.out.println(converter.solution3("-0234"));
        System.out.println(converter.solution3("-023"));
        System.out.println(converter.solution3("-02"));
        System.out.println(converter.solution3("-0"));

        System.out.println(converter.solution3("-99099"));
        System.out.println(converter.solution3("-9099"));
        System.out.println(converter.solution3("-909"));
        System.out.println(converter.solution3("-90"));
        System.out.println(converter.solution3("-9"));
    }

    public int solution(String s) {
        return Integer.parseInt(s);
    }

    public int solution2(String s) {
        return Integer.valueOf(s);
    }

    // 심심한 코드
    public int solution3(String s) {
        int strLen = 0;
        if (s.charAt(0) == '-' || s.charAt(0) == '+'){
            strLen = 1;
        }

        int[] arr = new int[]{10000,1000,100,10,1};

        int len = arr.length - s.length();

        int val = 0;
        for (int idx = strLen; idx < s.length(); idx++) {
            val += (s.charAt(idx) - 48) * arr[idx+len];
        }

        if (s.charAt(0) == '-'){
            return val * -1;
        }
        return val;
    }
}
