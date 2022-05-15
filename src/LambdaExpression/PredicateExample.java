package LambdaExpression;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> pEx = (s) -> {return s > 36;};
        Predicate<Integer> pIEx = (i) ->{return i%2==0;};
        Predicate<String> psEx = (i) ->{return i.equals("john");};

        System.out.println(pEx.test(28));
        System.out.println(pIEx.test(13));

        System.out.println(pEx.and(pIEx).test(20));
        System.out.println(pEx.or(pIEx).test(20));
        //System.out.println(pEx.or(psEx).test("10")); // need same type predicate, compiler error
        System.out.println(psEx.negate().test("marry"));

    }
}
