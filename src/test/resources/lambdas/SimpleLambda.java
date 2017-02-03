package lambdas;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class SimpleLambda {
    private static final Supplier<String> supplier = () -> "supplier";
    private static final Consumer<String> consumer = s -> {
        System.out.println("consumer " + s);
    };
    private static final Function<String, String> function = s -> s + "+";

    public static void main(String[] args) {
        String a = supplier.get();
        consumer.accept("a");
        String b = function.apply("b");
    }
}