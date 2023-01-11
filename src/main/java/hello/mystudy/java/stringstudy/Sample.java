package hello.mystudy.java.stringstudy;

public class Sample {
	public static void main(String[] args) {
		String a = "a";
		System.out.println("a = " + a);
		changeString(a);
		System.out.println("a = " + a);
		a += "cc";
		System.out.println("a = " + a);

		StringBuilder stringBuilder = new StringBuilder("a");
		System.out.println("stringBuilder = " + stringBuilder);
		changeStringBuilder(stringBuilder);
		System.out.println("stringBuilder = " + stringBuilder);
		stringBuilder.append("cc");
		System.out.println("stringBuilder = " + stringBuilder);
	}

	private static void changeStringBuilder(StringBuilder stringBuilder) {
		stringBuilder.append("bb");
	}

	private static void changeString(String s) {
		s += "bb";
	}
}
