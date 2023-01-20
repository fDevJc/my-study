package hello.mystudy.designpattern.abstractfactory;

public class Client {
	public static void main(String[] args) {
		Car hyunCar = CarFactory.getCarFactory(CarFactory.FactoryType.HYUNDAI).getCar();
		Car kiaCar = CarFactory.getCarFactory(CarFactory.FactoryType.KIA).getCar();

		hyunCar.run();
		kiaCar.run();
	}
}
