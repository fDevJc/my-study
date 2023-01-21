package hello.mystudy.designpattern.singletone;

public class Client {
	public static void main(String[] args) {
		EagerInit eagerInit1 = EagerInit.getInstance();
		EagerInit eagerInit2 = EagerInit.getInstance();

		System.out.println(eagerInit1 == eagerInit2);

		LazyInit lazyInit1 = LazyInit.getInstance();
		LazyInit lazyInit2 = LazyInit.getInstance();

		System.out.println(lazyInit1 == lazyInit2);

		Innerclass instance1 = Innerclass.getInstance();
		Innerclass instance2 = Innerclass.getInstance();

		System.out.println(instance1 == instance2);

	}
}
