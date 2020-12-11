package notefive;

public class Average {

    public static void main(String[] args) {
        Average average = new Average();
        System.out.println(average.solution(new int[] {1,2,3,4}));
        System.out.println(average.solution(new int[] {5,5}));
    }

    public double solution(int[] arr) {
        double sum = 0;
        for (int index : arr) {
            sum += index;
        }
        return (sum / arr.length);
    }
}
