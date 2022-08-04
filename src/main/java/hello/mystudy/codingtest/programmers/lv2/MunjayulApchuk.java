package hello.mystudy.codingtest.programmers.lv2;

import java.util.ArrayList;
import java.util.List;

public class MunjayulApchuk {
    public int solution(String s) {
        int answer = solutionDesc(s).length();
        return answer;
    }

    public String solutionDesc(String input) {
        String result = compactByUnit(input, 1);
        for (int i = 2; i < input.length() / 2 + 1; i++) {
            String temp = compactByUnit(input, i);
            if (result.length() >= temp.length()) {
                result = temp;
            }
        }
        return result;
    }

    public String compactByUnit(String input, int unit) {
        StringBuilder result =new StringBuilder();

        List<String> splitInputs = splitByUnit(input, unit);

        int count = 1;

        for (int i = 0; i < splitInputs.size(); i++) {
            String curString = splitInputs.get(i);
            String nextString = (i + 1) >= splitInputs.size() ? null : splitInputs.get(i + 1);

            if (curString.equals(nextString)) {
                count++;
            } else {
                if (count == 1) {
                    result.append(curString);
                } else {
                    result.append(count + curString);
                }
                count = 1;
            }
        }

        return result.toString();
    }

    private List<String> splitByUnit(String input, int unit) {
        List<String> result = new ArrayList<>();
        int inputLength = input.length();

        for (int i = 0; i < inputLength; i += unit) {
            int startIndex = i;
            int endIndex = startIndex + unit;
            if (endIndex >= inputLength) {
                endIndex = inputLength;
            }
            result.add(input.substring(startIndex, endIndex));
        }
        return result;
    }
}
