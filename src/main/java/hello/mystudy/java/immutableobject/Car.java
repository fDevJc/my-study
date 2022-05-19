package hello.mystudy.java.immutableobject;

import lombok.Getter;

@Getter
public class Car {
    private final String name;
    //원시타입을 포장 int -> Money
    private Money price;

    public Car(String name, Money price) {
        this.name = name;
        this.price = price;
    }

    /**
     * 차의 감가상각을 담당
     * @param year
     */
    public void depreciate(int year) {
        long l = price.get() - (year * 1_000_000);
        price = new Money(l);
    }
}
