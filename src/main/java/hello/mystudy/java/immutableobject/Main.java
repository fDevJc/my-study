package hello.mystudy.java.immutableobject;

public class Main {
    public static void main(String[] args) {
        Money money = new Money(100_000_000);

        Car car = new Car("tesla", money);
        System.out.println("car.getPrice() = " + car.getPrice().get());

        car.depreciate(10);
        System.out.println("car.getPrice() = " + car.getPrice().get());

        car.getPrice().add(new Money(100_000_000));
        System.out.println("car.getPrice() = " + car.getPrice().get());
    }
}
