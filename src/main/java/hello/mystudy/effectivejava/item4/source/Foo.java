package hello.mystudy.effectivejava.item4.source;

public class Foo {
    public static void main(String[] args) {
        PreventInstanceExample preventInstanceExample1 = new PreventInstanceExample() {
            @Override
            void foo() {
                super.foo();
            }
        };
        System.out.println("preventInstanceExample1.getClass() = " + preventInstanceExample1.getClass());
    }
}
