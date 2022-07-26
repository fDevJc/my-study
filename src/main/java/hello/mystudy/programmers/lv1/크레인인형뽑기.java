package hello.mystudy.programmers.lv1;

import java.util.ArrayList;
import java.util.List;

public class 크레인인형뽑기 {
    public int solution(int[][] board, int[] moves) {

        Machine machine = new Machine(board);
        for (int move : moves) {
            machine.pick(move);
        }

        return machine.getDestroyedDoll();
    }

    class Machine {
        int[][] board;
        List<Integer> bucket = new ArrayList<>();
        int destroyedDoll = 0;

        public Machine(int[][] board) {
            this.board = board;
        }

        public void pick(int location) {
            int realLocation = location - 1;
            for (int i = 0; i < board.length; i++) {
                int currentPositionDollOrNot = board[i][realLocation];
                if (currentPositionDollOrNot != 0) {
                    board[i][realLocation] = 0;
                    if (bucket.size() != 0) {
                        if (bucket.get(bucket.size() - 1) == currentPositionDollOrNot) {
                            bucket.remove(bucket.size() - 1);
                            destroyedDoll += 2;
                            break;
                        }
                    }
                    bucket.add(currentPositionDollOrNot);
                    break;
                }
            }
        }

        public int getDestroyedDoll() {
            return destroyedDoll;
        }
    }
}
