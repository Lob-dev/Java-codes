package notesix;

import java.util.Stack;

public class ClawCraneGame {

    public static void main(String[] args) {

        System.out.println(solution(
                new int[][]{{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}},
                new int[]{1, 5, 3, 5, 1, 2, 1, 4}));
    }

    // a x b (b개 짜리가 a개)
    // 5 x 5 (5개 짜리가 5개)

    //     1 2 3 4 5 = moves[]
    //     0 1 2 3 4
    // 0  [0,0,0,0,0]  [0] [0]~[4]
    // 1  [0,0,1,0,3]  [1] [0]~[4]
    // 2  [0,2,5,0,1]  [2] [0]~[4]
    // 3  [4,2,4,4,2]  [3] [0]~[4]
    // 4  [3,5,1,3,1]  [4] [0]~[4]

    public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (int move : moves) {
            // move = 위치

            // board 탐색
            for (int depth = 0; depth < board.length; depth++) {
                // depth = [0][move] ~ [4][move]
                // [깊이][위치]

                // 0이 아닐때까지 탐색 = 인형까지 탐색
                if (board[depth][move - 1] != 0){

                    // 스택에 인형이 없다면 집어넣기
                    if (stack.isEmpty()) {
                        stack.push(board[depth][move - 1]);

                        // 스택에 인형이 있다면 비교하기
                    } else {
                        // 같으면 스택에서 맨 위의 값을 제거하고 +2
                        if (stack.peek() == board[depth][move - 1]) {
                            stack.pop();
                            answer += 2;
                            // 같지 않으면 스택에 넣기
                        } else {
                            stack.push(board[depth][move - 1]);
                        }
                    }
                    // 해당 값을 사용했으니 (스택에 넣었으니) 0으로 변경
                    board[depth][move - 1] = 0;

                    // 더이상 탐색할 필요가 없으므로 해당 for 문 탈출
                    break;
                }
            }
        }
        return answer;
    }
}
