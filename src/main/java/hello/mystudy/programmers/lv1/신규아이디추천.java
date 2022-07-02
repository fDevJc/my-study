package hello.mystudy.programmers.lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class 신규아이디추천 {
    public String solution(String new_id) {

        NewIdRecommender recommender = new NewIdRecommender();

        //1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
        recommender.addStrategy(new SmallLetterConverter());

        //2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
        List<String> whiteList = new ArrayList<>();
        whiteList.add("[a-z0-9-_.]");
        recommender.addStrategy(new LetterRemover(whiteList));

        //3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
        List<String> toRemoveList = new ArrayList<>();
        toRemoveList.add(".");
        recommender.addStrategy(new DuplicateLettersRemover(toRemoveList));

        //4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
        recommender.addStrategy(new FirstAndLastLetterRemover("."));

        //5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
        recommender.addStrategy(new EmptyLetterConverter("a"));

        //6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
        //만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
        recommender.addStrategy(new MaxLengthRemover(15));
        recommender.addStrategy(new FirstAndLastLetterRemover("."));

        //7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
        recommender.addStrategy(new MinLengthMaker(3));

        return recommender.recommendId(new_id);
    }

    static class NewIdRecommender {
        private List<IdConvertStrategy> strategies = new ArrayList<>();

        public void addStrategy(IdConvertStrategy strategy) {
            this.strategies.add(strategy);
        }

        public String recommendId(String id) {
            String result = id;
            for (IdConvertStrategy strategy : strategies) {
                result = strategy.convert(result);
            }
            return result;
        }
    }

    interface IdConvertStrategy {
        String convert(String id);
    }

    static class SmallLetterConverter implements IdConvertStrategy {
        @Override
        public String convert(String id) {
            return id.toLowerCase();
        }
    }

    static class LetterRemover implements IdConvertStrategy {
        private final List<String> whitePatternList;
        public LetterRemover(List<String> whitePatternList) {
            this.whitePatternList = whitePatternList;
        }

        @Override
        public String convert(String id) {
            return Arrays.stream(id.split(""))
                    .map(c -> getStringByWhiteList(c))
                    .collect(Collectors.joining());
        }

        private String getStringByWhiteList(String c) {
            return isInWhiteList(c) ? c : "";
        }

        private boolean isInWhiteList(String c) {
            return whitePatternList.stream().anyMatch(c::matches);
        }
    }

    static class DuplicateLettersRemover implements IdConvertStrategy {
        private final List<String> toRemoveList;

        public DuplicateLettersRemover(List<String> toRemoveList) {
            this.toRemoveList = toRemoveList;
        }

        @Override
        public String convert(String id) {
            String result = id;
            for (String toRemoveChar : toRemoveList) {
                result = removeDuplicateLetter(result, toRemoveChar);
            }
            return result;
        }

        private String removeDuplicateLetter(String inString, String toRemoveChar) {
            String[] splitInStrings = inString.split("");
            String prev = "";
            StringBuilder result = new StringBuilder();

            for (String splitInString : splitInStrings) {
                if (splitInString.equals(toRemoveChar)) {
                    if (splitInString.equals(prev)) {
                        continue;
                    } else {
                        prev = splitInString;
                        result.append(splitInString);
                    }
                } else {
                    prev = "";
                    result.append(splitInString);
                }
            }
            return result.toString();
        }
    }

    static class FirstAndLastLetterRemover implements IdConvertStrategy {
        private final String removeLetter;

        public FirstAndLastLetterRemover(String removeLetter) {
            this.removeLetter = removeLetter;
        }

        @Override
        public String convert(String id) {
            String result = id;
            if (result.startsWith(removeLetter)) {
                result = result.substring(1);
            }

            if (result.endsWith(removeLetter)) {
                if (result.length() > 0) {
                    result = result.substring(0, result.length() - 1);
                }
            }

            return result;
        }
    }

    static class EmptyLetterConverter implements IdConvertStrategy {
        private final String replaceLetter;

        public EmptyLetterConverter(String replaceLetter) {
            this.replaceLetter = replaceLetter;
        }

        @Override
        public String convert(String id) {
            return id.isEmpty() ? replaceLetter : id;
        }
    }

    static class MaxLengthRemover implements IdConvertStrategy {
        private final int maxIdLength;

        public MaxLengthRemover(int maxIdLength) {
            this.maxIdLength = maxIdLength;
        }

        @Override
        public String convert(String id) {
            return id.length() > maxIdLength ? id.substring(0, maxIdLength) : id;
        }
    }

    static class MinLengthMaker implements IdConvertStrategy {
        private final int minIdLength;

        public MinLengthMaker(int minIdLength) {
            this.minIdLength = minIdLength;
        }

        @Override
        public String convert(String id) {
            return id.length() < minIdLength ? makeMinLengthId(id) : id;
        }

        private String makeMinLengthId(String id) {
            int insufficientIdCount = minIdLength - id.length();
            String lastLetter = id.substring(id.length() - 1);
            StringBuilder result = new StringBuilder(id);

            for (int i = 0; i < insufficientIdCount; i++) {
                result.append(lastLetter);
            }
            return result.toString();
        }
    }
}
