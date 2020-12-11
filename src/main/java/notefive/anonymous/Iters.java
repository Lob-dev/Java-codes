package notefive.anonymous;

public class Iters {
    public static void main(String[] args) {
        fors();
        whiles();
        doWhiles();
        enhancedFors();
        labeledFors();
    }

    public static void fors(){
        int total = 0;
        for (int loopCount = 0; loopCount <= 100; loopCount++) {
            total += loopCount;
        }
        System.out.println(total);
    }

    public static void whiles(){
        int total = 0;
        int loopCount = 1;
        while(loopCount <= 100){
            total += loopCount;
            ++loopCount;
        }
        System.out.println(total);
    }

    public static void doWhiles(){
        int total = 0;
        int loopCount = 1;
        do {
            total += loopCount;
            ++loopCount;
        }while(loopCount <= 100);
        System.out.println(total);
    }

    public static void enhancedFors(){
        int total = 0;
        int[] numArr = {10,20,30,40,50,60,70,80,90,100};
        for (int num : numArr){
            total += num;
        }
        System.out.println(total);
    }

    public static void labeledFors(){
        int total = 0;

        loop1: for (;;){
            for (int inLoop=0;inLoop<=100;inLoop++){
                total += inLoop;
                if(inLoop==100) {
                    break loop1;
                }
            }
        }
        System.out.println(total);
    }
}

