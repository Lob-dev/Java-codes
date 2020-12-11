package noteio;

import javax.management.relation.RelationNotFoundException;

public class plusplus {
    public static void main(String[] args) {

        int numC = 10;
        System.out.println(--numC);
        System.out.println("numC = " + numC);

        int numD = 10;
        System.out.println(++numD);
        System.out.println("numD = " + numD);

        int numE = 10;
        System.out.println(numE--);
        System.out.println("numE = " + numE);

        int numF = 10;
        System.out.println(numF--);
        System.out.println("numF = " + numF);


        Integer numss = 10;
        int numsss = 10;
        numss = numss + numsss;

        numss += numsss;
        System.out.println("numA = " + numss);

        Runnable runnable = () -> System.out.println("Hello!");

        runnable.run();

        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello!");
            }
        };

    }




}
