package hello.mystudy.programmers.lv1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class LottoRankTest {
    LottoRank lottoRank = new LottoRank();

    @Test
    void ex1() {
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};

        int[] result = lottoRank.solution(lottos, win_nums);

        Assertions.assertThat(result).containsExactly(3, 5);
    }

    @Test
    void ex2() {
        int[] lottos = {0, 0, 0, 0, 0, 0};

        int[] win_nums = {38, 19, 20, 40, 15, 25};

        int[] result = lottoRank.solution(lottos, win_nums);

        Assertions.assertThat(result).containsExactly(1, 6);
    }

    @Test
    void ex3() {
        int[] lottos = {45, 4, 35, 20, 3, 9};
        int[] win_nums = {20, 9, 3, 45, 4, 35};

        int[] result = lottoRank.solution(lottos, win_nums);

        Assertions.assertThat(result).containsExactly(1, 1);
    }

}