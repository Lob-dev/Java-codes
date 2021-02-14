package noteseven;

import java.util.Arrays;
import java.util.Comparator;

public class BigNumber {

	public static void main(String[] args) {
		System.out.println(solution(new int[] {6, 10, 2}));
		System.out.println(solution(new int[] {3, 30, 34, 5, 9}));
		System.out.println(solution(new int[] {0, 30, 34, 5, 9}));
		System.out.println(solution(new int[] {0, 0, 0}));
	}

	public static String solution(int[] numbers) {
		StringBuilder answer = new StringBuilder();

		String[] strArr = new String[numbers.length];

		int idx = 0;
		for (int number : numbers) {
			strArr[idx++] = ""+number;
		}

		Arrays.sort(strArr, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));

		if (strArr[0].equals("0")) {
			return "0";
		} else {
			for (String s : strArr) {
				answer.append(s);
			}
		}
		return answer.toString();
	}
}
