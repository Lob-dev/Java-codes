package noteone;

public class ArrayReverseExample {

    public static void main(String[] args) {

        int[] numArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int length = numArray.length - 1;
        int tmp = 0;

        for (int i = 0; i < numArray.length / 2; i++) {
            // 0 1 2 3 4 i
            // 9 8 7 6 5 length - i
            tmp = numArray[i];
            numArray[i] = numArray[(length - (i))];
            numArray[(length - (i))] = tmp;
        }

        for (int idx : numArray){
            System.out.println("idx = " + idx);
        }
    }
}
