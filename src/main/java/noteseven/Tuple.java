package noteseven;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;



public class Tuple {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution("{{2},{2,1},{2,1,3},{2,1,3,4}}")));
	}

	// 프로그래머스 Tuple
	public static int[] solution(String s) {

		String[] split = s.replaceAll("[{}]", " ").trim().split(" ,");

		int[] result = new int[split.length];
		List<Integer> set = new ArrayList<>();

		Arrays.sort(split, Comparator.comparingInt(String::length));

		int idx = 0;
		for (String st : split) {
			for (String str : st.split(",")) {
				idx = check(result, set, idx, str);
			}
		}

		return result;
	}

	private static int check(int[] result, List<Integer> set, int idx, String str) {
		if (!set.contains(Integer.parseInt(str.trim()))) {
			set.add(Integer.parseInt(str.trim()));
			result[idx++] = Integer.parseInt(str.trim());
		}
		return idx;
	}
}
