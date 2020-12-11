package noteThree;

public class getMiddleChar {
    public static void main(String[] args) {

        getMiddleChar getMiddleChar = new getMiddleChar();

/*        System.out.println(getMiddleChar.solution("abcde"));
        System.out.println(getMiddleChar.solution("qwer"));
        System.out.println(getMiddleChar.solution2(new String[]{"Jane", "Kim"}));*/
        System.out.println(getMiddleChar.solution3(10));
        System.out.println(getMiddleChar.solution3(5));

    }


    // 00000000
    // 01234567
    // 0123 8/2 = 4-1, 4

    // 0000000
    // 0123456
    // 0123

    public String solution(String str){
        int len = str.length();

        if (str.length() % 2 == 0){
            len = len / 2;
            return str.substring(len-1,len+1);
        }

        len = len / 2;
        return String.valueOf(str.charAt(len));
    }

    public String solution2(String[] str){
        int len = 0;
        for (int loopCount = 0; loopCount < str.length; loopCount++) {
            if (str[loopCount].equals("Kim")){
                len = loopCount;
            }
        }
        return "김서방은 "+String.valueOf(len)+"에 있다";
    }

    public int solution3(int number){

        int result = 0;

        for (int loopCount = 1; loopCount < number; loopCount++) {
            if (number % loopCount == 0){
                ++result;
            }
        }
        return result;
    }
}
