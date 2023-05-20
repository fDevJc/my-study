package hello.lotto;

public class Customer {
	private Money holdingAmount;
	private LottoStore lottoStore;

	public Customer(Money money) {
		this.holdingAmount = money;
	}

	public Lotto buyLotto(LottoPaper lottoPaper) {
		Money lottoPrice = lottoStore.getLottoPrice();
		decreaseAmount(lottoPrice);
		return lottoStore.buy(lottoPrice);
	}

	private void decreaseAmount(Money money) {
		holdingAmount = holdingAmount.minus(money);
	}

	public void go(LottoStore lottoStore) {
		this.lottoStore = lottoStore;
	}
}
