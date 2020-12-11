package notefive.anonymous;

import java.util.*;

public class Parenthesis {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int loop = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < loop; i++) {
            String[] split = scanner.nextLine().split("");
            check(split);
        }
    }
    public static void check(String[] split){
        long count = 0;

        for (int index = 0; index < split.length; index++) {
            if (split[index].equals("(")){
                ++count;
            } else if (split[index].equals(")")) {
                --count;
            }
        }

        if (count == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
