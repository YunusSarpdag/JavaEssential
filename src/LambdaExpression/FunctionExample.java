package LambdaExpression;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class FunctionExample {
    public static void main(String[] args) {
        Function<String, String> fs = (s) -> {
            return s.toUpperCase();
        };

        Function<Integer, Integer> fi = (i) -> {
            System.out.println("fi");
            return i * 2;
        };
        Function<Integer, Integer> fi2 = (i) -> {
            System.out.println("fi2");
            return i * 3;
        };


        System.out.println(fs.apply("yunus"));
        System.out.println(fi.apply(3));
        System.out.println(fi2.apply(5));
        System.out.println("-----------------");
        System.out.println(fi.andThen(fi2).apply(5));
        System.out.println(fi.compose(fi2).apply(5));

        //UnaryOperator is child of Function it takes one parameter and return same type, so we can use all methods of Function
        UnaryOperator<Integer> uI = (i) ->{return i*10;};
        System.out.println("******************");
        System.out.println(uI.apply(5));
        System.out.println(uI.andThen(fi).apply(12));
        System.out.println(fi.andThen(uI).apply(20));

        System.out.println("///////////////////");
        FunctionExample functionExample = new FunctionExample();
        Function<String ,String> methodReference= FunctionExample::testMethodReference;
        Function<String ,String> methodReference2 = functionExample::testMethodReferenceInstanceMethod;
        Function<String ,String> methodReference3 = String::toUpperCase;

        System.out.println(methodReference.apply("yunus"));
        System.out.println(methodReference2.apply("yunus"));
        System.out.println(methodReference3.apply("yunus"));

    }

    public static String testMethodReference(String s){
        return s.toUpperCase();
    }

    public String testMethodReferenceInstanceMethod(String s){
        return s.toUpperCase();
    }
}
