package hello.mystudy.designpattern.factorymethod;

public abstract class PizzaFactory {
	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		pizza.create();
		pizza.box();

		return pizza;
	}
	abstract Pizza createPizza(String type);
}
