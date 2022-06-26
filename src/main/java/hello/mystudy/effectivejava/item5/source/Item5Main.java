package hello.mystudy.effectivejava.item5.source;

import java.util.function.Supplier;

public class Item5Main {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "hello world";
        String result = supplier.get();
        System.out.println("result = " + result);
    }

    static class Item {
        public Item(String str) {

        }
    }
}
