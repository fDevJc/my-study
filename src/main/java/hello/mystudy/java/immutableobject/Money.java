package hello.mystudy.java.immutableobject;

import lombok.Getter;

/*
    원시값을 포장
    장점
        자신의 상태를 객체 스스로 관리한다. (유효성검사: 돈은 0보다 작은 값이 들어갈수 없다 )
        자료형의 구애를 받지 않는다. long int double, 필요하면 String -> long 변환 등 여러 값을 받아사용가능 ( 여러 타입 지원 가능 )

     불변 객체
        외부에서 값을 임의로 수정할 수 없게 제어한다.
     장점
        프로그램의 안정성을 올릴 수 있다.
 */
public class Money {
    private static final int MIN_VALUE = 0;

    private final long value;

    public Money(int value) {
        validateMoneyValue(value);
        this.value = (long) value;
    }

    public Money(long value) {
        validateMoneyValue(value);
        this.value = value;
    }

    public Money add(Money money) {
        return new Money(this.value + money.value);
    }

    public long get() {
        return value;
    }

    private void validateMoneyValue(long money) {
        if (money < MIN_VALUE) {
            throw new IllegalArgumentException("돈은 0보다 작을 수 없습니다.");
        }
    }
}
