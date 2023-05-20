package hello.lotto;

public class LottoStore {
	private Money lottoPrice;

	public LottoStore(Money won) {
		this.lottoPrice = won;
	}

	public Lotto buy(Money money) {
		if (lottoPrice.equals(money)) {
			return new Lotto();
		}
		return null;
	}

	public Money getLottoPrice() {
		return lottoPrice;
	}
}
