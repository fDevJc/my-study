package hello.lotto;

import org.jetbrains.annotations.NotNull;

public class Money {
	private Integer amount;

	private Money(int won) {
		this.amount = won;
	}

	public static Money won(int won) {
		return new Money(won);
	}

	public Money minus(@NotNull Money money) {
		return new Money(this.amount - money.amount);
	}
}
