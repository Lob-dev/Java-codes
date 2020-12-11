package notefour;

public class EvenOdd {
    public static void main(String[] args) {

    }
    public static String solution(int num) {

       if (num == 0){ return "Even"; }
       if (num % 2 == 0){ return "Even"; }

       return "Odd";
    }
}
