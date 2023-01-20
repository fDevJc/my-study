package hello.mystudy.designpattern.abstractfactory;

public class HyunCarFactory extends CarFactory {
	@Override
	Car getCar() {
		System.out.println("현대 차 조립 시작...");
		System.out.println("현대 차 조립 완료...");
		return new HyunCar();
	}
}
