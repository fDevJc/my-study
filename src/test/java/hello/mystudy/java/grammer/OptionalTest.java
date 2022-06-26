package hello.mystudy.java.grammer;

import org.junit.jupiter.api.Test;

import java.util.Optional;

public class OptionalTest {
    @Test
    void OptionalIfPresent() {
        Optional<Foo> optionalFoo = Optional.of(new Foo());
        //만약 null이 아니라면
        optionalFoo.ifPresent(foo -> System.out.println("optionalFoo = " + foo));
    }

    static class Foo {

    }
}
