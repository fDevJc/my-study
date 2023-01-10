package hello.mystudy.java.defaultmethod;

public interface Walkable {
	default void execute() {
		System.out.println("walking!!");
	}
}
