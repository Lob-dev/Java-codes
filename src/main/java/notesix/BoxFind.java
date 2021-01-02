package notesix;

import java.util.Arrays;

public class BoxFind {

	public static void main(String[] args) {
		System.out.println(solution(new int[][]{{0, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {0, 0, 1, 0}}));
		System.out.println(solution(new int[][]{{0, 0, 1, 1}, {1, 1, 1, 1}}));
	}

	/*
	0  1  2  3

	0, 1, 1, 1
	1, 1, 1, 1
	1, 1, 1, 1
	0, 0, 1, 0

	 */

	public static int solution(int[][] board) {
		int[][] dpBoard = new int[board.length + 1][board[0].length + 1];

		for (int i = 0; i < board.length; i++) {
			System.arraycopy(board[i], 0, dpBoard[i + 1], 1, board[i].length);
		}

		int max = 0;
		for (int i = 1; i < dpBoard.length; i++) {
			for (int j = 1; j < dpBoard[i].length; j++) {
				if (dpBoard[i][j] == 1) {
					int min = Math.min(dpBoard[i - 1][j], Math.min(dpBoard[i][j - 1], dpBoard[i - 1][j - 1]));
					dpBoard[i][j] = min + 1;
					max = Math.max(max, min + 1);
				}
			}
		}
		return max * max;
	}
}
