package DefaultMethod;

import javax.sound.midi.VoiceStatus;

public class TestDefaultMethods implements DefaultMethodInterface,DefaultMethodInterface2{

    public static void main(String[] args) {
        TestDefaultMethods testDefaultMethods = new TestDefaultMethods();
        testDefaultMethods.test();
        testDefaultMethods.test2();
        DefaultMethodInterface2.testStatic();
        testDefaultMethods.testStatic(); //default static methods only accessible on interface and can not override
    }

    @Override
    public void test(){
        //DefaultMethodInterface.super.test();
        System.out.println("Implementation of abstract method");
    }

    // can be overridden or refer to which implementation will be invoked
    @Override
    public void test2() {
        DefaultMethodInterface.super.test2();
        DefaultMethodInterface2.super.test2();
        System.out.println("Custom Implementation of test2 default");
    }

    @Override
    public String toString() {
        return "TestDefaultMethods{}";
    }

    //this is not override , this is hiding
    //@Override
    static public void testStatic(){
        System.out.println("Static in implementation");
    }
}
