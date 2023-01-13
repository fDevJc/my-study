package hello.mystudy.java.threaddeadlock;

public class Sample {
	public static void main(String[] args) {

		Object object1 = new Object();
		Object object2 = new Object();

		SampleThread sampleThread1 = new SampleThread(object1, object2);
		SampleThread sampleThread2 = new SampleThread(object2, object1);

		sampleThread1.start();
		sampleThread2.start();
	}
}
