package hello.mystudy.programmers.lv1;

import java.util.HashSet;
import java.util.Set;

public class 키패드누르기_re {
    public String solution(int[] numbers, String hand) {
        Hands hands = new Hands(hand);
        StringBuilder result = new StringBuilder();
        for (int number : numbers) {
            result.append(hands.press(number));
        }

        Object[][] keypad = {{1, 4, 7, "*"}, {2, 5, 8, 0}, {3, 6, 9, "#"}};

        return result.toString();
    }

    class Hands {
        private String hand;
        private Hand rightHand;
        private Hand leftHand;

        public Hands(String hand) {
            this.hand = hand;
            rightHand = Hand.getRightHand();
            leftHand = Hand.getLeftHand();
        }

        public String press(int number) {
            int rightDistance = rightHand.getDistance(number);
            int leftDistance = leftHand.getDistance(number);

            return rightDistance > leftDistance ? leftHand.handString : rightHand.handString;
        }
    }

    static class Hand {
        private String handString;
        private Position position = new Position();
        private Set<Integer> basicNumbers = new HashSet<>();

        private Hand(String handString) {
            this.handString = handString;
        }

        public static Hand getRightHand() {
            Hand r = new Hand("R");
//            position.init("R");
            r.basicNumbers.add(3);
            r.basicNumbers.add(6);
            r.basicNumbers.add(9);
            return r;
        }

        public static Hand getLeftHand() {
            Hand l = new Hand("L");
//            position.init("L");
            l.basicNumbers.add(1);
            l.basicNumbers.add(4);
            l.basicNumbers.add(7);
            return l;
        }

        public int getDistance(int number) {
            if (basicNumbers.contains(number)) {
                return 0;
            }
            return 1;
        }
    }

    static class Position {
        int x;
        int y;
    }
}
