package hello.mystudy.codingtest.programmers.lv2;

import java.util.Collections;
import java.util.PriorityQueue;

public class 디펜스게임 {
	public int solution(int n, int k, int[] enemy) {
		int answer = 0;
		PriorityQueue<Integer> enemyQueue = new PriorityQueue<>(Collections.reverseOrder());
		int totalEnemy = 0;
		int invincibilityCount = k;
		int enemyLength = enemy.length;

		if (enemyLength == k) {
			return k;
		}

		for (int i = 0; i < enemyLength; i++) {
			enemyQueue.add(enemy[i]);
			totalEnemy += enemy[i];

			if (totalEnemy > n) {
				if (invincibilityCount == 0) {
					break;
				}
				int maxEnemy = enemyQueue.poll();
				totalEnemy -= maxEnemy;
				invincibilityCount--;
			}
			answer++;
		}
		return answer;
	}
}
