package hello.mystudy.programmers.lv1;

import java.util.HashSet;
import java.util.Set;

public class 키패드누르기 {
    public String solution(int[] numbers, String hand) {
        Hands hands = new Hands(hand);
        StringBuilder result = new StringBuilder();
        for (int number : numbers) {
            result.append(hands.getHandDirection(number));
        }
        return result.toString();
    }

    class Hands {
        private Hand hand;
        private Hand rightHand;
        private Hand leftHand;
        public Hands(String hand) {
            initHand(hand);
        }

        private void initHand(String hand) {
            this.rightHand = new Hand("R");
            this.leftHand = new Hand("L");
            if (hand.equals("right")) {
                this.hand = rightHand;
            } else {
                this.hand = leftHand;
            }
        }

        public String getHandDirection(int number) {
            int rightHandDistance = rightHand.getDistance(number);
            int leftHandDistance = leftHand.getDistance(number);

            if (leftHandDistance < rightHandDistance) {
                leftHand.setPositionByNumber(number);
                return leftHand.getHandString();
            } else if (rightHandDistance < leftHandDistance) {
                rightHand.setPositionByNumber(number);
                return rightHand.getHandString();
            } else {
                hand.setPositionByNumber(number);
                return hand.getHandString();
            }
        }
    }

    class Hand {
        private Set<Integer> basicNumbers = new HashSet<>();
        private String handDirection;
        private Position position;
        public Hand(String direction) {
            this.handDirection = direction;
            initHand(direction);
        }

        private void initHand(String direction) {
            if (direction.equals("R")) {
                basicNumbers.add(3);
                basicNumbers.add(6);
                basicNumbers.add(9);
                position = new Position("#");
            } else {
                basicNumbers.add(1);
                basicNumbers.add(4);
                basicNumbers.add(7);
                position = new Position("*");
            }
        }

        public int getDistance(int number) {
            if (basicNumbers.contains(number)) {
                return 0;
            } else {
                return position.getDistance(number);
            }
        }

        public String getHandString() {
            return handDirection;
        }

        public void setPositionByNumber(int number) {
            this.position = position.getPositionByNumber(number);
        }
    }

    class Position {
        private int xPosition;
        private int yPosition;

        public Position(String initHandPosition) {
            initPosition(initHandPosition);
        }

        public Position(int xPosition, int yPosition) {
            this.xPosition = xPosition;
            this.yPosition = yPosition;
        }

        private void initPosition(String initHandPosition) {
            if (initHandPosition.equals("#")) {
                xPosition = 3;
                yPosition = 4;
            } else if (initHandPosition.equals("*")) {
                xPosition = 1;
                yPosition = 4;
            }
        }

        public Position getPositionByNumber(int number) {
            int xPosition = 0;
            int yPosition = 0;
            switch (number) {
                case 1:
                    xPosition = 1;
                    yPosition = 1;
                    break;
                case 2:
                    xPosition = 2;
                    yPosition = 1;
                    break;
                case 3:
                    xPosition = 3;
                    yPosition = 1;
                    break;
                case 4:
                    xPosition = 1;
                    yPosition = 2;
                    break;
                case 5:
                    xPosition = 2;
                    yPosition = 2;
                    break;
                case 6:
                    xPosition = 3;
                    yPosition = 2;
                    break;
                case 7:
                    xPosition = 1;
                    yPosition = 3;
                    break;
                case 8:
                    xPosition = 2;
                    yPosition = 3;
                    break;
                case 9:
                    xPosition = 3;
                    yPosition = 3;
                    break;
                case 0:
                    xPosition = 2;
                    yPosition = 4;
                    break;
            }
            return new Position(xPosition, yPosition);
        }

        public int getDistance(int number) {
            Position numberPosition = getPositionByNumber(number);
            int xAbs = Math.abs(this.xPosition - numberPosition.xPosition);
            int yAbs = Math.abs(this.yPosition - numberPosition.yPosition);
            return xAbs + yAbs;
        }
    }
}
