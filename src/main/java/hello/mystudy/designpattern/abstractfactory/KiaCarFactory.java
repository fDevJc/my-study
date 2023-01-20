package hello.mystudy.designpattern.abstractfactory;

public class KiaCarFactory extends CarFactory {
	@Override
	Car getCar() {
		System.out.println("기아 차 조립 시작...");
		System.out.println("기아 차 조립 완료...");
		return new KiaCar();
	}
}
