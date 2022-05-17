package hello.mystudy.java.java8.defaultmethod;

public class DmMain {
    public static void main(String[] args) {

        Foo foo = new Foo();

        System.out.println("foo.returnMsg(\"wow\") = " + foo.returnMsg("wow"));
        System.out.println("foo.returnHello(\"wow\") = " + foo.returnHello("wow"));
        foo.printMsg("wow");
    }

    static class Foo implements SampleInterface {
        @Override
        public String returnMsg(String msg) {
            return msg;
        }
    }
}
