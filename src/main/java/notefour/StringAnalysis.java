package notefour;

import java.util.Scanner;

public class StringAnalysis {
    public static void main(String[] args) {
        StringAnalysis analysis = new StringAnalysis();

        System.out.println(analysis.analysis("This is String"));
        System.out.println(analysis.analysis("SPACE    1    SPACE"));
        System.out.println(analysis.analysis(" S a M p L e I n P u T"));
        System.out.println(analysis.analysis("0L1A2S3T4L5I6N7E8"));
    }

    public String analysis(String str){

        String[] split = str.split("");

        int low=0, upper=0, num=0, space=0;

        for (int loop=0; loop < str.length(); loop++){
            char s = split[loop].charAt(0);

            if (split[loop].equals(" ")){
                ++space;
            } else if(Character.isDigit(s)){
                ++num;
            } else if(Character.isUpperCase(s)){
                ++upper;
            } else if (Character.isLowerCase(s)){
                ++low;
            }
        }

        return low+" "+upper+" "+num+" "+space;
    }



}
