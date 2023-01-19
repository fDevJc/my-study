package hello.mystudy.designpattern.factorymethod;

public class CheesePizza extends Pizza{
	@Override
	void create() {
		System.out.println("created CheesePizza");
	}

	@Override
	void box() {
		System.out.println("boxed CheesePizza");
	}
}
