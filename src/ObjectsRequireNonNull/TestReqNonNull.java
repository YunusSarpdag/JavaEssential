package ObjectsRequireNonNull;

import java.util.Objects;

public class TestReqNonNull {

    public static void main(String[] args) {
        Person tp= null;
        System.out.println("test : " +Objects.toString(tp));  // dont throw NPE
        //tp.toString(); throws NPE
        test(tp);
    }

    public static void test(Person p){
        Objects.requireNonNull(p , "Person cant be null");
        System.out.println(p.getName());
    }
}


class Person{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
