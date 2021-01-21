package notesix;

public class getCount {

	public static void main(String[] args) {
		System.out.println(getCount(new int[]{165, 180, 175, 167, 128, 200, 167, 138, 176, 156}, 10, 165, 167));
	}

	private static int getCount(int[] data, int n, int m, int s) {
		int count = 0; //확인해보아야 할 후보의 수

		for (int datum : data) {
			if (datum == m || datum == s) {
				count++;
			}
		}

		return count;
	}
}
