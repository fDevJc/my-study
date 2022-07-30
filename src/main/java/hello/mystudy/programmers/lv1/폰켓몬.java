package hello.mystudy.programmers.lv1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class 폰켓몬 {
    public int solutionRe(int[] nums) {
        Set<Integer> ponketmons = new HashSet<>();
        int toBeAbleToHavePonketmonCount = nums.length / 2;

        for (int num : nums) {
            ponketmons.add(num);
        }

        return toBeAbleToHavePonketmonCount >= ponketmons.size() ? ponketmons.size() : toBeAbleToHavePonketmonCount;
    }

    public int solution(int[] nums) {
        return Arrays.stream(nums).boxed().collect(Collectors.collectingAndThen(Collectors.toSet(),
                ponketmons -> Integer.min(nums.length / 2, ponketmons.size())));
    }
}
