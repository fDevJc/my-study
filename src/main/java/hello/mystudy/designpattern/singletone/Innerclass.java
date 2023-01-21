package hello.mystudy.designpattern.singletone;

public class Innerclass {
	private Innerclass() {

	}

	private static class SingleTone {
		private static final Innerclass INSTANCE = new Innerclass();
	}

	public static Innerclass getInstance() {
		return SingleTone.INSTANCE;
	}
}
