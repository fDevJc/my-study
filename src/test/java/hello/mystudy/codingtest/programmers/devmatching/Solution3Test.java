package hello.mystudy.codingtest.programmers.devmatching;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Solution3Test {
	@Test
	void test() {
		Solution3 test = new Solution3();
		String[] subway = {"0 1 2 3 4", "1 12 13 14"};
		int result = test.solution(subway, 2, 12);
		assertThat(result).isEqualTo(1);
	}

	@Test
	void test2() {
		Solution3 test = new Solution3();
		String[] subway = {"1 2 3 4 5", "6 7 8 9", "1 9", "11 12"};
		int result = test.solution(subway, 4, 7);
		assertThat(result).isEqualTo(2);
	}
}

/*
select bb.id,bb.name,nvl2(cnt,cnt,0)
from branches bb ,(
select b.id,b.name,count(b.id) as cnt
from sellings s , employees e, branches b
where s.employee_id = e.id
and e.branch_id = b.id
and s.car_id = 306
group by b.id, b.name
) t
where bb.id = t.id(+)
 */