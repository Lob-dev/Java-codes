package noteseven;

public class AngerTrigger {

	public static void main(String[] args) {
		System.out.println(check(10, new int[]{56,46,55,76,65,53,52,53,55,50}));
		printIndexes(new String[]{"HELL","CHOSUN","SKK","KOREA","AJOU","YONSEI","SEOUL","AJOU","AJOU","WOOSONG"}, 10);
	}

	private static int check(int n, int[] data) {

		int res = data[data.length-1];
		int count = 0;

		for (int i = n-1; i > 0; i--) {
			if (res < data[i]) {
				res = data[i];
				count++;
			}
		}

		return count;
	}

	public static void printIndexes(String[] school, int n)
	{
		int first = -1; //존재하지 않으면 -1
		int last = -1;  //존재하지 않으면 -1

		int location = 0;
		for (int i=0; i<n/2; i++) {
			if(school[i].equals("AJOU")) {
				first = i+1;
				location = i;
				break;
			}
		}

		for (int i=n-1; i>location; i--) {
			if(school[i].equals("AJOU")) {
				last = i+1;
				break;
			}
		}

		System.out.printf("%d %d\n", first, last );
	}
}
