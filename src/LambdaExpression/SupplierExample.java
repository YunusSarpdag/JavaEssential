package LambdaExpression;

import java.time.LocalDate;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
    Supplier<Integer> integerSupplier = ()->{return LocalDate.now().getDayOfMonth();};
    System.out.println(integerSupplier.get());
    }
}
