package DefaultMethod;

public interface DefaultMethodInterface2 {
    void test();
    default void test2(){
        System.out.println("Default method of DefaultMethodInterface2");
        testPrivate();
    }
     private void testPrivate(){
        System.out.println("default private method");
    }

    static void testStatic(){
        System.out.println("Test static default method");
    }

    /*
    //object class methods can not override
    @Override
    public String toString() {
        return "TestDefaultMethods{}";
    }
    ?/
     */

    public static void main(String[] args) {
        System.out.println("main method in interface");
    }
}
