package noteseven.math;

public class LeastComMultiple {

	public static void main(String[] args) {
		System.out.println(solution(new int[] {2,6,8,14}));
		System.out.println(solution(new int[] {1,2,3}));
	}

	public static int solution(int[] arr) {
		int answer = 1;

		for (int num : arr) {
			// 1 , 2 , 6 , 24 , 168
			answer = lcm(answer, num);
		}
		return answer;
	}

	public static int gcd(int a, int b) {
		while(b!=0) {
			int r = b;
			b = a % b;
			a = r;
		}
		return a;
	}

	public static int lcm(int a, int b) {
		return (a*b)/gcd(a,b);
	}
}
