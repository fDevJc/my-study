package hello.mystudy.java.java8.lambda;

public class LambdaExample1 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("LambdaExample1.thread1.run");
            }
        });

        Thread thread2 = new Thread(() -> System.out.println("LambdaExample1.thread2.main"));

        thread1.run();
        thread2.run();
    }
}
