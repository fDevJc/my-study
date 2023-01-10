package hello.mystudy.java.defaultmethod;

public class Sample implements Runnable, Walkable {
	public static void main(String[] args) {
		Sample sample = new Sample();
		sample.execute();
	}

	//동일 default 메소드가 존재하는 경우 오버라이딩해서 사용
	@Override
	public void execute() {
		Runnable.super.execute();
	}
}
