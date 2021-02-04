package notesix;

public class TeacherQuiz {

	public static void main(String[] args) {
		System.out.println(check(10, 55));
		System.out.println(check(20, 350));
		System.out.println(check(100, 5050));
	}

	// 인프런 선생님 퀴즈
	private static String check(int num, int result) {
		int sum = 0;
		for (int i = 0; i <= num; i++) {
			sum += i;
		}
		return sum == result ? "YES" : "NO";
	}
}
