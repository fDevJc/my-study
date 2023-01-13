package hello.mystudy.java.threaddeadlock;

public class SampleThread extends Thread{
	private Object object1;
	private Object object2;
	public SampleThread(Object object1, Object object2) {
		this.object1 = object1;
		this.object2 = object2;
	}

	@Override
	public void run() {
		synchronized (object1) {
			System.out.println(this.getId() + " - object1 lock");

			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}

			System.out.println(this.getId() + " - object2 lock wait");

			synchronized (object2) {
				System.out.println(this.getId() + " - object2 lock");
			}
		}
	}
}
