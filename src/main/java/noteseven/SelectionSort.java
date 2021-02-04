package noteseven;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[]{5, 3, 5, 1, 2, 4})));
	}

	public static int[] solution(final int[] array) {

		for (int i = 0; i < array.length; i++) {
			int j = minIndex(array, i);
			swap(array, i, j);
		}
		return array;
	}
	private static void swap(final int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	private static int minIndex(final int[] array, int i) {
		int idx = i;
		for (int j = idx; j < array.length; j++) {
			if (array[j] < array[idx]) {
				idx = j;
			}
		}
		return idx;
	}
}
