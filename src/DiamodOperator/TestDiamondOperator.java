package DiamodOperator;

public class TestDiamondOperator {
    public static void main(String[] args) {
        TestGeneric<String> genericE = new TestGeneric<>();
        System.out.println(genericE.test("ali"));
        //System.out.println(genericE.test(5)); compile time type check
    }
}

class  TestGeneric<T>{
    T t ;

    public T test(T t1){
        return t1 != null ? t1 : null;
    }
}
