package hello.mystudy.java.etc;

public class LoadingSample {
	static {
		System.out.println("1.static block");
	}

	public static void main(String[] args) {
		new Sample();
	}

	static class Sample {
		static {
			System.out.println("2.sample static block");
		}

		Temp temp = new Temp();

		public Sample() {
			System.out.println("4.sample constructor");
		}
	}

	static class Temp {
		public Temp() {
			System.out.println("3.temp constructor");
		}
	}
}
