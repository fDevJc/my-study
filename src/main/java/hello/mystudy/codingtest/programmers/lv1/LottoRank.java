package hello.mystudy.codingtest.programmers.lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LottoRank {
    /**
     *
     * @param lottos 입력된 로또번호
     * @param win_nums 입력된 1등번호
     * @return 최고순위, 최저순위
     */
    public int[] solution(int[] lottos, int[] win_nums) {
        ErasedLotto erasedLotto = new ErasedLotto();

        erasedLotto.init(lottos, new NormalLottoRankStrategy());
        erasedLotto.checkWinNumbers(win_nums);

        int[] answer = new int[2];
        answer[0] = erasedLotto.getHighestRank();
        answer[1] = erasedLotto.getLowestRank();
        return answer;
    }

    static class ErasedLotto {
        private LottoRankStrategy lottoRankStrategy;
        private List<Integer> notErasedNumbers = new ArrayList<>();
        private int erasedNumberCount = 0;
        private int winNumberCount = 0;

        public void init(int[] lottos, LottoRankStrategy lottoRankStrategy) {
            this.lottoRankStrategy = lottoRankStrategy;
            Arrays.stream(lottos).forEach(i->{
                if ((i == 0)) {
                    addErasedNumberCount();
                } else {
                    addNotErasedNumber(i);
                }
            });
        }

        private void addNotErasedNumber(int lottoNumber) {
            notErasedNumbers.add(lottoNumber);
        }

        private void addErasedNumberCount() {
            erasedNumberCount++;
        }

        public void checkWinNumbers(int[] winNumbers) {
            Arrays.stream(winNumbers).forEach(winNumber->{
                if (hasWinNumber(winNumber)) {
                    addWinNumberCount();
                }
            });
        }

        private boolean hasWinNumber(int winNumber) {
            return notErasedNumbers.contains(winNumber);
        }

        private void addWinNumberCount() {
            winNumberCount++;
        }

        public int getHighestRank() {
            return lottoRankStrategy.getRank(erasedNumberCount + winNumberCount);
        }

        public int getLowestRank() {
            return lottoRankStrategy.getRank(winNumberCount);
        }
    }

    interface LottoRankStrategy {
        int getRank(int winNumberCount);
    }

    static class NormalLottoRankStrategy implements LottoRankStrategy {
        @Override
        public int getRank(int winNumberCount) {
            switch (winNumberCount) {
                case 6:
                    return 1;
                case 5:
                    return 2;
                case 4:
                    return 3;
                case 3:
                    return 4;
                case 2:
                    return 5;
                default:
                    return 6;
            }
        }
    }
}
