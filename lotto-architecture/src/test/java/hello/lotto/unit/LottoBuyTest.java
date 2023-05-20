package hello.lotto.unit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import hello.lotto.Customer;
import hello.lotto.Lotto;
import hello.lotto.LottoPaper;
import hello.lotto.LottoStore;
import hello.lotto.Money;

public class LottoBuyTest {
	@Test
	void buy() throws Exception {
		Customer customer = new Customer(Money.won(14000));
		customer.go(new LottoStore(Money.won(1000)));
		LottoPaper lottoPaper = new LottoPaper(1,2,3,4,5,6);
		Lotto lotto = customer.buyLotto(lottoPaper);
		Assertions.assertThat(lotto).isNotNull();
	}
}
