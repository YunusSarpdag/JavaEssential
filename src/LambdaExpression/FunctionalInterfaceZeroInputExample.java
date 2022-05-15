package LambdaExpression;

@FunctionalInterface
public interface FunctionalInterfaceZeroInputExample {
    // functional interface has only one abstract method and can be any numbers of default , static and private method
    void testLambda();

    static void test1(){
        System.out.println("Static method 1");
    }

    static void test2(){
        System.out.println("Static method 2");
    }

    private void private1(){
        System.out.println("Private method 1");
    }

    private void private2(){
        System.out.println("Private method 2");
    }
}
