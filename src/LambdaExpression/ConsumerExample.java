package LambdaExpression;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        // this is not return value just process it
        Consumer<String> cs = input -> System.out.println("cs consumer : " + input);
        Consumer<String> cs2 = input -> System.out.println("cs2 consumer : " + input);

        cs.accept("yunus");
        cs2.accept("yunus");

        cs.andThen(cs2).accept("john");
    }
}
