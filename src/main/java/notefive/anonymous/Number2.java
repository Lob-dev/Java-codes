package notefive.anonymous;

public class Number2 {
    public static void main(String[] args) {
        Number2 number2 = new Number2();

        System.out.println(number2.solution(121));
    }

    public long solution(long n) {
        long answer = 0;

        Double value = Math.sqrt(n);

        if(value == value.intValue()){
            return (long) Math.pow(value+1,2);
        }

        return -1;
    }

    public long solution2(long n) {
        if(n==1){
            return 4;
        }
        for(long i=2;i<n;i++){
            if(n/i == i && n%i ==0){
                return (i+1)*(i+1);
            }
        }
        return -1;
    }
}
