package hello.mystudy.java.java8.lambda;

import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;

public class LambdaExample2 {
    public static void main(String[] args) throws Exception {
        Consumer<String> stringConsumer = (String str) -> System.out.println("str = " + str);
        stringConsumer.accept("hello world");

        Consumer objectConsumer = obj -> System.out.println("str = " + obj);
        objectConsumer.accept("hello world");
        objectConsumer.accept(1);
        objectConsumer.accept(new Foo("Foo's name"));

        Function<Integer, Integer> function = (Integer i) -> {
            if (i != null) {
                return i + 10;
            }
            return null;
        };

        Integer apply = function.apply(1);
        System.out.println("apply = " + apply);

        Callable<String> callable = () -> "hello world";
        String call = callable.call();
        System.out.println("call = " + call);



    }

    static class Foo {
        private String name;

        public Foo(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Foo{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}
