package hello.mystudy.designpattern.factorymethod;

public class SPizzaFactory extends PizzaFactory{
	@Override
	Pizza createPizza(String type) {
		return new CheesePizza();
	}
}
