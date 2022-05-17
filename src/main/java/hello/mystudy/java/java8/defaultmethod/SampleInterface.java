package hello.mystudy.java.java8.defaultmethod;

public interface SampleInterface {
    String returnMsg(String msg);

    //주의: 메서드 구현의 강제성이 사라짐
    default void printMsg(String msg) {
        System.out.println("msg = " + msg);
    }

    default String returnHello(String msg) {
        return "hello" + msg;
    }
}
