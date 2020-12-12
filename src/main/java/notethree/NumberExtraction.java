package notethree;

public class NumberExtraction {
    public static void main(String[] args) {

        System.out.println(numberExtraction("str001234"));
        System.out.println(numberExtraction("34s4t32523r001234"));
        System.out.println(numberExtraction("s324523tr001234"));
        System.out.println(numberExtraction("s35tr001234"));
        System.out.println(numberExtraction("s435tr001234"));
        System.out.println();
        System.out.println();
        System.out.println(numberExtraction("t0e0a1c2her"));


    }

    public static String numberExtraction(String str){
        if (str.length() > 50){ return "fail"; }
        char tmp;

        StringBuilder res = new StringBuilder();

        for (int loopCount = 0; loopCount < str.length(); loopCount++) {
            tmp = str.charAt(loopCount);
            if (Character.isDigit(tmp) && tmp != '0'){
                res.append(tmp);
            }
        }
        return res.toString();
    }
}
