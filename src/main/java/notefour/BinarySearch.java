package notefour;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {

        BinarySearch binarySearch = new BinarySearch();

        System.out.println("data "+binarySearch.binary(new int[]{10,3,6,7,8,9,20,40,5,2}, 6)+" index");
    }

    private int binary(int[] num, int find){

        int first = 0;
        int last = num.length-1;
        int middle = last / 2;
        int res = -1;

        Arrays.sort(num);
        System.out.println(" = " + Arrays.toString(num));

        while (true){
            if (num[middle] < find){
                first = middle+1;
                middle = (first + last) / 2;
            } else if (num[middle] > find){
                last = middle-1;
                middle = last / 2;
            } else if (num[middle] == find){
                res = find;
                break;
            }
            System.out.println("loops");
        }

        return middle;

    }
}
