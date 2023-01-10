package hello.mystudy.java.defaultmethod;

public interface Runnable {
	default void execute() {
		System.out.println("running!!");
	}
}
