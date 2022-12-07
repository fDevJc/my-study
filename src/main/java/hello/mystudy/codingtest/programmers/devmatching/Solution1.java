package hello.mystudy.codingtest.programmers.devmatching;

class Solution1 {
	public int solution(int low, int high, String[] img) {
		//정사각형을 찾고
		//수식검증
		//low <= k /(n-2)^2 * 100 <= high

		for (int i = 0; i < img.length; i++) {
			String[] rows = img[i].split("");
			for (int j = 0; j < rows.length; j++) {
				String cursor = rows[j];
				if ("#".equals(cursor)) {
					//우측확인
					// for

				}
			}
		}
		
		int answer = 0;
		return answer;
	}
}
