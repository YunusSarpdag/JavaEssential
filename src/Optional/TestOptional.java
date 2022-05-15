package Optional;

import java.util.Optional;

public class TestOptional {
    public static void main(String[] args) {
        testOptional();
    }

    static void testOptional(){
        String [] arr = new String[3];
        arr[0] = "yunus";
        Optional<String> op = Optional.of(arr[0]); // use if you sure value not null or throws error
        Optional<String> op2 = Optional.ofNullable(arr[1]); // use if you are not sure value can be null

        System.out.println(op.get());
        op2.ifPresent( o -> System.out.println(o));

        System.out.println("----------------  1");
        System.out.println(op.orElse("Value can not be null"));
        System.out.println(op2.orElse("Value can not be null"));

        System.out.println("----------------  2");

        System.out.println(op.map(o -> o.toUpperCase()));
        System.out.println(op2.map(o -> o.toUpperCase()));

        System.out.println("----------------  3");

        System.out.println(op.filter(o-> o.equals("yunus")));
        System.out.println(op2.filter(o-> o.equals("yunus")));

        System.out.println("----------------  4");
        op.ifPresent(o-> System.out.println(o));
        op2.ifPresent(o-> System.out.println(o));

        System.out.println("----------------  4");
        System.out.println(op.orElseGet(()-> "null value"));
        System.out.println(op2.orElseGet(()-> "null value"));
    }
}
