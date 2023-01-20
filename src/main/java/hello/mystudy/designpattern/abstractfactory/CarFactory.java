package hello.mystudy.designpattern.abstractfactory;

public abstract class CarFactory {
	public enum FactoryType {
		HYUNDAI, KIA
	}

	static CarFactory getCarFactory(FactoryType factoryType) {
		if (factoryType.equals(FactoryType.HYUNDAI)) {
			return new HyunCarFactory();
		} else {
			return new KiaCarFactory();
		}
	}

	abstract Car getCar();
}
