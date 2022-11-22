package hello.mystudy.codingtest.programmers.lv2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class 롤케이크자르기 {
	public int solution(int[] topping) {
		Set<Integer> firstPiece = new HashSet<>();
		Map<Integer,Integer> secondPiece = new HashMap<>();
		int count = 0;

		for (int i = 0; i < topping.length; i++) {
			secondPiece.put(topping[i], secondPiece.getOrDefault(topping[i], 0) + 1);
		}

		for (int i = 0; i < topping.length; i++) {
			int toppingNumber = topping[i];
			firstPiece.add(toppingNumber);

			Integer secondPieceCount = secondPiece.getOrDefault(toppingNumber, 0);
			if (secondPieceCount == 1) {
				secondPiece.remove(toppingNumber);
			} else {
				secondPiece.put(toppingNumber, secondPieceCount - 1);
			}
			if (firstPiece.size() == secondPiece.size()) {
				count++;
			}
		}
		return count;
	}
}
