package notethree;

//2016년 1월 1일은 금요일입니다. 2016년 a월 b일은 무슨 요일일까요?
//두 수 a ,b를 입력받아 2016년 a월 b일이 무슨 요일인지 리턴하는 함수,
// solution을 완성하세요. 요일의 이름은 일요일부터 토요일까지 각각 SUN,MON,TUE,WED,THU,FRI,SAT
//입니다. 예를 들어 a=5, b=24라면 5월 24일은 화요일이므로 문자열 TUE를 반환하세요.

//제한 조건
//2016년은 윤년입니다.
//2016년 a월 b일은 실제로 있는 날입니다. (13월 26일이나 2월 45일같은 날짜는 주어지지 않습니다)
//입출력 예
//a	b	result
//5	24	TUE

public class String_2016 {
    public static void main(String[] args) {
        String_2016 string2016 = new String_2016();
        System.out.println(string2016.solution(5,24));
    }

    public String solution(int a, int b){
        int total = 0;

        String[] w = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] month = {31,29,31,30,31,30,31,31,30,31,30,31};

        // 입력받은 월 값을 기준으로 모든 일수를 더함 (윤년이므로 2월이 29일)
        for(int loopCount =0; loopCount<a-1; loopCount++){ total += month[loopCount]; }

        // 입력받은 일 값을 기준으로 값을 더함
        total += b-1;

        // 1월 1일이 금요일이므로 배열을 금요일부터 생성.
        // 총 요일 % 7 = 현재 요일
        return w[total%7];
    }
}
