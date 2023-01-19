package hello.mystudy.designpattern.factorymethod;

public class BPizzaFactory extends PizzaFactory{
	@Override
	Pizza createPizza(String type) {
		if (type.equals("cheese")) {
			return new CheesePizza();
		}
		return null;
	}
}
