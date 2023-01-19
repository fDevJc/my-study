package hello.mystudy.designpattern.factorymethod;

public class Sample {
	public static void main(String[] args) {
		PizzaFactory bFactory = new BPizzaFactory();
		PizzaFactory sFactory = new SPizzaFactory();

		bFactory.orderPizza("cheese");
		sFactory.orderPizza("cheese");
	}
}
