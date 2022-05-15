package DefaultMethod;

public interface DefaultMethodInterface {
    void test();
    default void test2(){
        System.out.println("Default method of DefaultMethodInterface");
    }
}
