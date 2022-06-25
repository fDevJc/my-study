package hello.mystudy.programmers.lv1;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {
    Solution test = new Solution();
    @Test
    void ex1() {
        String[] idList = {"muzi", "frodo","apeach","neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k = 2;

        int[] solution = test.solution(idList, report, k);

        assertThat(solution).containsExactly(2, 1, 1, 0);
    }

    @Test
    void ex2() {
        String[] idList = {"con", "ryan"};
        String[] report = {"ryan con", "ryan con", "ryan con", "ryan con"};
        int k = 3;

        int[] solution = test.solution(idList, report, k);

        assertThat(solution).containsExactly(0, 0);
    }
}