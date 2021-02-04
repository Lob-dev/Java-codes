package notefive;

public class Acorn {

	public static void main(String[] args) {
		System.out.println();
	}

	public static int getMaximumHeight(int[] height, int[] month, int n, int m){

		int len = height.length;

		int result = 0;
		for (int i = 0; i < len; i++) {

			if(month[i] == m) {
				if (result < height[i]) { result = height[i]; }
			}

		}
		return result != 0 ? result : -1;
	}
}
