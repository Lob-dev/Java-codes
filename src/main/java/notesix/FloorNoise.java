package notesix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FloorNoise {

	public static void main(String[] args) throws IOException {
		System.out.println(check(10, 90));
	}

	// n = n초 동안의 측정값
	// m = 경보가 울리는 경계값

	// 23 17 120 34 112 136 123 23 25 113
	public static int check(int n, int m) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");

		int count = 0;
		int result = 0;
		for (String s : str) {

			if (Integer.parseInt(s) > m) {
				count++;
			} else {
				count = 0;
			}

			result = getResult(count, result);
		}

		return result;
	}

	private static int getResult(int count, int result) {
		if (count > result) {
			result = count;
		}
		return result;
	}
}
