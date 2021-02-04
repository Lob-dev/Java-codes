package noteseven;

import java.util.ArrayList;
import java.util.List;

public class AddDecimal {

	public static void main(String[] args) {
		System.out.println(solution(new int[]{1,2,3,4}));
		System.out.println(solution(new int[]{1,2,7,6,4}));
	}

	// 프로그래머스 소수 만들기
	public static int solution(int[] numbers) {

		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i+1; j < numbers.length; j++) {
				for (int k = j+1; k < numbers.length; k++) {
					list.add((numbers[i]+numbers[j]+numbers[k]));
				}
			}
		}

		int count = 0;
		for (Integer integer : list) {
			count += isPrime(integer);
		}

		return count;
	}


	private static int isPrime(int num) {
		for (int i = 2; i+i <= num; i++) {
			if (num % i == 0) {
				return 0;
			}
		}
		return 1;
	}
}
